package com.youmias.elephant.dao;

import com.youmias.elephant.po.Province;

import java.util.List;

public interface ProvinceMapper {
    int deleteByPrimaryKey(String id);

    int insert(Province record);

    int insertSelective(Province record);

    Province selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Province record);

    int updateByPrimaryKey(Province record);

    List<Province> getProvinceList();

    Province getCityList(String pid);

}