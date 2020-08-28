package com.youmias.elephant.dao;

import com.youmias.elephant.po.TmpTeacher;

public interface TmpTeacherMapper {
    int deleteByPrimaryKey(String tId);

    int insert(TmpTeacher record);

    int insertSelective(TmpTeacher record);

    TmpTeacher selectByPrimaryKey(String tId);

    int updateByPrimaryKeySelective(TmpTeacher record);

    int updateByPrimaryKey(TmpTeacher record);
}