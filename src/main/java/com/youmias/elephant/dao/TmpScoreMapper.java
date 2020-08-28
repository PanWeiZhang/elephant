package com.youmias.elephant.dao;

import com.youmias.elephant.po.TmpScore;
import org.apache.ibatis.annotations.Param;

public interface TmpScoreMapper {
    int deleteByPrimaryKey(@Param("sId") String sId, @Param("cId") String cId);

    int insert(TmpScore record);

    int insertSelective(TmpScore record);

    TmpScore selectByPrimaryKey(@Param("sId") String sId, @Param("cId") String cId);

    int updateByPrimaryKeySelective(TmpScore record);

    int updateByPrimaryKey(TmpScore record);
}