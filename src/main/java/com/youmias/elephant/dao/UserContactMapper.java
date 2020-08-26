package com.youmias.elephant.dao;

import com.youmias.elephant.po.UserContact;

public interface UserContactMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserContact record);

    int insertSelective(UserContact record);

    UserContact selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserContact record);

    int updateByPrimaryKey(UserContact record);
}