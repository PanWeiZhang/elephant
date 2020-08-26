package com.youmias.elephant.dao;

import com.youmias.elephant.po.IndustryTwo;

public interface IndustryTwoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(IndustryTwo record);

    int insertSelective(IndustryTwo record);

    IndustryTwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndustryTwo record);

    int updateByPrimaryKey(IndustryTwo record);
}