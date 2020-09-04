package com.youmias.elephant.dao;

import com.youmias.elephant.po.County;

import java.util.List;

public interface CountyMapper {
    int deleteByPrimaryKey(String id);

    int insert(County record);

    int insertSelective(County record);

    County selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(County record);

    int updateByPrimaryKey(County record);

    List<County> getAllCountys();
}