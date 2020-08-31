package com.youmias.elephant.service;

import com.youmias.elephant.dao.UserMapper;
import com.youmias.elephant.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserMapper userMapper;

	/*
	*
	* @Dec 返回某用户信息
	* @Author Zpw
	*
	* */
	public User getUserInfo(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}
}
