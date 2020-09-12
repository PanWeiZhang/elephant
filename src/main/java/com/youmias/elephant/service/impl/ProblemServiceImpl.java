package com.youmias.elephant.service.impl;

import com.github.pagehelper.Page;
import com.youmias.elephant.dao.ProblemMapper;
import com.youmias.elephant.dao.ProvinceMapper;
import com.youmias.elephant.po.Problem;
import com.youmias.elephant.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	private ProblemMapper problemMapper;


	@Override
	public Problem getProblemById(String id) {
		return problemMapper.selectByPrimaryKey(id);
	}

    @Override
    public void insertProblem(Problem problem) {
	    problemMapper.insert(problem);
    }

    @Override
    public Page<Problem> getProblemList() {
        return (Page<Problem>) problemMapper.selectAll();
    }

    @Override
    public Page<Problem> byKeywordProblemList(String keyword) {
        return (Page<Problem>) problemMapper.likeSelectKeyword(keyword);
    }

    @Override
    public Page<Problem> selectByProblemList(Integer sponsorId) {
        return (Page<Problem>) problemMapper.selectBySponsorId(sponsorId);
    }
}
