package com.youmias.elephant.service.impl;

import com.youmias.elephant.dao.UserMapper;
import com.youmias.elephant.po.User;
import com.youmias.elephant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	/*
	 *
	 * @Dec 返回某用户信息
	 * @Author zpw
	 *
	 * */
	@Override
	public User getUserInfo(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User isHashUser(String mobile) {
		return userMapper.selectOnlyUser(mobile);
	}

	/**
	 * @Dec 注册用户
	 * @Author zpw
	 *
	 */
	@Override
	public void insertUser(User user) {userMapper.insert(user);}

}
