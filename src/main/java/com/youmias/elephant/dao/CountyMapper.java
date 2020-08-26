package com.youmias.elephant.dao;

import com.youmias.elephant.po.County;

public interface CountyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);
}