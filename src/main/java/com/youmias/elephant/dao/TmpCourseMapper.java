package com.youmias.elephant.dao;

import com.youmias.elephant.po.TmpCourse;

public interface TmpCourseMapper {
    int deleteByPrimaryKey(String cId);

    int insert(TmpCourse record);

    int insertSelective(TmpCourse record);

    TmpCourse selectByPrimaryKey(String cId);

    int updateByPrimaryKeySelective(TmpCourse record);

    int updateByPrimaryKey(TmpCourse record);

    TmpCourse selectCourse();

}