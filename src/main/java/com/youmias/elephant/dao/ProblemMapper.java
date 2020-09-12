package com.youmias.elephant.dao;

import com.youmias.elephant.po.Problem;

import java.util.List;

public interface ProblemMapper {
    int deleteByPrimaryKey(String id);

    int insert(Problem record);

    int insertSelective(Problem record);

    Problem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Problem record);

    int updateByPrimaryKeyWithBLOBs(Problem record);

    int updateByPrimaryKey(Problem record);

    List<Problem> selectAll();

    List<Problem> likeSelectKeyword(String keyword);

    List<Problem> selectBySponsorId(Integer sponsorId);

}
