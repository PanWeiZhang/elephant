package com.youmias.elephant.service;

import com.youmias.elephant.po.User;

public interface UserService {


	/*
	* @Param id
	* */
	User getUserInfo(Integer id);

	User isHashUser(String mobile);

	void insertUser(User user);

}
