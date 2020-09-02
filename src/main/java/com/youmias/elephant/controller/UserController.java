package com.youmias.elephant.controller;


import com.youmias.elephant.po.User;
import com.youmias.elephant.po.UserContact;
import com.youmias.elephant.service.UserContactService;
import com.youmias.elephant.service.UserService;
import com.youmias.elephant.utils.JwtUtil;
import net.bytebuddy.implementation.bytecode.Throw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
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

	@PostMapping("/login")
	public Map<String, String> userLogin(@RequestParam(value="phone", required=true) String phone,
	                                     @RequestParam(value="password", required=true) String password){
		Map<String,String> map = new HashMap<>();
		User findUser = userService.isHashUser(phone);
		if(findUser == null){
			map.put("msg","登录失败,用户不存在");
			map.put("status","error");
			map.put("code","500");
		}else{
			Integer uid = findUser.getId();
			User loginUser = userService.getUserInfo(uid);
			if(loginUser.getMobile().equals(phone) && loginUser.getPassword().equals(password)){
				String token = JwtUtil.createToken(loginUser);
				map.put("token",token);
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

}
