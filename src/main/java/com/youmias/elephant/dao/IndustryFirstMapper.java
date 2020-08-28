package com.youmias.elephant.dao;

import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

public interface IndustryFirstMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryFirst record);

    int insertSelective(IndustryFirst record);

    IndustryFirst selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(IndustryFirst record);

    int updateByPrimaryKey(IndustryFirst record);

    List<IndustryFirst> onetomore();

    //二级
//    @Select("select a.id,a.`name`,a.`code`,b.id AS t_id,b.`code` AS t_code,b.`name` AS t_name from industry_two a join industry_first b ON a.industry_first_id = b.id")
    //一级
//    @Select("select a.id,a.`name`,a.`code`,b.id AS t_id,b.`code` AS t_code,b.`name` AS t_name from industry_first a join industry_two b ON  a.id = b.industry_first_id;")

}