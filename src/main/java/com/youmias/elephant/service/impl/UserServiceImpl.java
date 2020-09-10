package com.youmias.elephant.service.impl;

import com.youmias.elephant.dao.UserLoginLogMapper;
import com.youmias.elephant.dao.UserLoginMapper;
import com.youmias.elephant.dao.UserMapper;
import com.youmias.elephant.po.User;
import com.youmias.elephant.po.UserLogin;
import com.youmias.elephant.po.UserLoginLog;
import com.youmias.elephant.service.UserService;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Autowired
	UserLoginMapper userLoginMapper;
	@Autowired
	UserLoginLogMapper userLoginLogMapper;

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



	/**
	 * @Dec 用户登录信息记录
	 * @Author zpw
	 *
	 */
	@Override
	public void loginInfomationInsert(UserLogin record) {
		userLoginMapper.insert(record);
	}

	@Override
	public void loginLogInfomationInsert(UserLoginLog record) {
		userLoginLogMapper.insert(record);
	}

	/*
	 *
	 * @Dec 查找登录信息
	 * @Author zpw
	 *
	 * */
	@Override
	public UserLogin selectLoginInfomaiton(UserLogin userLogin){
		return userLoginMapper.byUserIdSelectInfomation(userLogin);
	}

	@Override
	public int updateLoginInfomation(UserLogin userLogin) {
		userLoginMapper.updateByUserIdSelective(userLogin);
		return 1;
	}


	/*
	 *
	 * @Dec 是否已经记录过用户登录的状态
	 * @Author zpw
	 *
	 * */
	@Override
	public UserLogin isLogined(Integer userId) {
		return userLoginMapper.selectHasLogin(userId);
	}


}
