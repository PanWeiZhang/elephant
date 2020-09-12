package com.youmias.elephant.service;

import com.github.pagehelper.Page;
import com.youmias.elephant.po.Problem;

import java.util.List;

public interface  ProblemService {

	Problem getProblemById(String id);

    void insertProblem(Problem problem);

    Page<Problem> getProblemList();

    Page<Problem> byKeywordProblemList(String keyword);

    Page<Problem> selectByProblemList(Integer sponsorId);
}
