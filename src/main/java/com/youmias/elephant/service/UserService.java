package com.youmias.elephant.service;

import com.youmias.elephant.po.User;
import com.youmias.elephant.po.UserLogin;
import com.youmias.elephant.po.UserLoginLog;
import org.apache.ibatis.annotations.Update;

public interface UserService {


	/*
	* @Param id
	* */
	User getUserInfo(Integer id);

	User isHashUser(String mobile);

	void insertUser(User user);

	void  loginInfomationInsert(UserLogin record);

	void  loginLogInfomationInsert(UserLoginLog record);

	UserLogin selectLoginInfomaiton(UserLogin userLogin);

	int updateLoginInfomation(UserLogin userLogin);

	UserLogin isLogined(Integer userId);

}
