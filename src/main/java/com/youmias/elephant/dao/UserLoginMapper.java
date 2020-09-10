package com.youmias.elephant.dao;

import com.youmias.elephant.po.UserLogin;

public interface UserLoginMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserLogin record);

    int insertSelective(UserLogin record);

    UserLogin selectByPrimaryKey(Integer id);

    UserLogin selectHasLogin(Integer userId);

    UserLogin byUserIdSelectInfomation(UserLogin userLogin);

    int updateByPrimaryKeySelective(UserLogin record);

    int updateByUserIdSelective(UserLogin record);

    int updateByPrimaryKey(UserLogin record);
}