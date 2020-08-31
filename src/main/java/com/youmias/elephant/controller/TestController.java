package com.youmias.elephant.controller;

import com.youmias.elephant.po.*;
import com.youmias.elephant.service.InfomationService;
import com.youmias.elephant.service.UserService;
import com.youmias.elephant.utils.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
//@RequestMapping("/secure") //登录拦截器  拦截 /secure/* 的请求
public class TestController extends BaseController{

	private static final Logger log = LoggerFactory.getLogger(TestController.class);

	@Autowired
	@Qualifier("infomationService")
	private InfomationService infomationService;

	@Autowired
	private UserService userService;


	@RequestMapping("/get")
	public String info(){
		return "this is Spring Boot";
	}


	/*
	* 测试一：查询某学生所有科目的成绩
	 */
	@RequestMapping("/tSycn")
	public TmpStudent getTsycn(){
		TmpStudent stu = infomationService.getSyncService();
		return stu;
	}

	/*
	*测试二：查询某学生某一门科目的成绩
	 */
	@RequestMapping("/tNycc")
	public TmpCourse getTsycn2(){
		TmpCourse stu = infomationService.getSyncService2();
		return stu;
	}

	/**
	 * 模拟测试用户登录
	 */
	@RequestMapping("/login")
	public Map<String,String> login(User user) {
		Map<Integer, User> userMap = new HashMap<>();
		Map<String,String> result = new HashMap<>();

		String uName = "张三",
			   uPwd = "123456";
		User us = userService.getUserInfo(1);
		userMap.put(1,us);

		for (User dbUser : userMap.values()) {
			if (dbUser.getName().equals(uName) && dbUser.getPassword().equals(uPwd)) {
				String token = JwtUtil.createToken(dbUser);
				log.info("登录成功！生成token！！！");
				log.info(token);
				result.put("token",token);
				return result;
			}
		}
		return result;
	}

	/**
	 * 测试登录拦截器（不合法返回错误，合法返回用户信息）
	 */
	@RequestMapping("/getUserInfo")
	public User getUserInfomation(Integer userId) {
		User u = userService.getUserInfo(userId);
		return u;
	}

}


