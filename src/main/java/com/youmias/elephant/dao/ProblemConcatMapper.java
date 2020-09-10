package com.youmias.elephant.dao;

import com.youmias.elephant.po.ProblemConcat;

public interface ProblemConcatMapper {
    int deleteByPrimaryKey(String id);

    int insert(ProblemConcat record);

    int insertSelective(ProblemConcat record);

    ProblemConcat selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ProblemConcat record);

    int updateByPrimaryKey(ProblemConcat record);
}