package com.youmias.elephant.controller;


import com.youmias.elephant.po.User;
import com.youmias.elephant.po.UserContact;
import com.youmias.elephant.po.UserLogin;
import com.youmias.elephant.po.UserLoginLog;
import com.youmias.elephant.service.UserContactService;
import com.youmias.elephant.service.UserService;
import com.youmias.elephant.utils.JwtUtil;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController{

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;
	@Autowired
	UserContactService userContactService;


	/**
	 * @Dec 注册用户
	 * @Author zpw
	 * @Time 2020-09-02
	 *
	 */

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	@PostMapping("/regiter")
	public Map<String, String> regiterUser(@RequestBody User user){
		try{
			Map<String,String> map = new HashMap<>();
			String uMobile = user.getMobile();
			User isUser = userService.isHashUser(uMobile);
			if(isUser == null){
				Date ct = new Date();
				user.setCreatedAt(ct);
				user.setUpdatedAt(ct);
				userService.insertUser(user);
				Date uct = new Date();
				UserContact uc = new UserContact();
				uc.setUserId(user.getId());
				uc.setMobile(user.getMobile());
				uc.setProfession(user.getProfession());
				uc.setCreatedAt(uct);
				uc.setUpdatedAt(uct);
				userContactService.insertUserContact(uc);
				map.put("msg","成功");
				map.put("status","success");
				map.put("code","200");
			}else{
				map.put("msg","注册失败,用户已存在");
				map.put("status","error");
				map.put("code","500");
			}
			return  map;
		}catch (RuntimeException e){
			throw new RuntimeException(e);
		}
	}

	/**
	 * @Dec 用户登录
	 * @Author zpw
	 * @Time 2020-09-02
	 */
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
	@PostMapping(value = "/login")
	public Map<String, Object> userLogin(@RequestBody User user){
		Map<String,Object> map = new HashMap<>();
		User findUser = userService.isHashUser(user.getMobile());
		if(findUser == null){
			map.put("msg","用户不存在");
			map.put("status","error");
			map.put("code","500");
		}else{
			Integer uid = findUser.getId();
			User loginUser = userService.getUserInfo(uid);
			if(loginUser.getMobile().equals(user.getMobile()) && loginUser.getPassword().equals(user.getPassword())){
				String token = JwtUtil.createToken(loginUser);
				UserLogin isHasHistory = userService.isLogined(uid);
				if(isHasHistory == null){
					UserLogin ul = new UserLogin();
					ul.setUserId(uid);
					ul.setToken(token);
					ul.setLoginStatus(1);
					ul.setCreateTime(new Date());
					ul.setUpdateTime(new Date());
					userService.loginInfomationInsert(ul);
				}else{
					//更新token , updateTime字段
					UserLogin ul = new UserLogin();
					ul.setUserId(uid);
					ul.setLoginStatus(1);
					ul.setToken(token);
					ul.setUpdateTime(new Date());
					userService.updateLoginInfomation(ul);
				}
				UserLoginLog ull = new UserLoginLog();
				ull.setUserId(uid);
				ull.setToken(token);
				ull.setType(1);
				ull.setCreateTime(new Date());
				ull.setUpdateTime(new Date());
				userService.loginLogInfomationInsert(ull);
				map.put("token",token);
				map.put("userId",uid);
				map.put("msg","成功");
				map.put("status","success");
				map.put("code","200");
			}else{
				map.put("msg","账号或密码错误");
				map.put("status","error");
				map.put("code","500");
			}
		}
		return  map;
	}


	/**
	 * @Dec 用户退出登录
	 * @Author zpw
	 * @Time 2020-09-10
	 */

	@PostMapping(value = "/unlogin")
	public Map<String, String> userUnLogin(@RequestParam(name = "userId") Integer userId){
		Map<String,String> map = new HashMap<>();
		UserLogin userLoginInfo = userService.isLogined(userId);
		UserLoginLog ull = new UserLoginLog();
		ull.setUserId(userLoginInfo.getUserId());
		ull.setToken(userLoginInfo.getToken());
		ull.setType(2);
		ull.setCreateTime(new Date());
		ull.setUpdateTime(new Date());
		userService.loginLogInfomationInsert(ull);
		UserLogin ul = new UserLogin();
		ul.setUserId(userId);
		ul.setLoginStatus(2);
		userService.updateLoginInfomation(ul);
		map.put("msg","成功");
		map.put("status","success");
		map.put("code","200");
		return  map;
	}

}
