package com.youmias.elephant.dao;

import com.youmias.elephant.po.TmpStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TmpStudentMapper {
    int deleteByPrimaryKey(String sId);

    int insert(TmpStudent record);

    int insertSelective(TmpStudent record);

    TmpStudent selectByPrimaryKey(String sId);

    int updateByPrimaryKeySelective(TmpStudent record);

    int updateByPrimaryKey(TmpStudent record);

    TmpStudent getSyStudent();

}