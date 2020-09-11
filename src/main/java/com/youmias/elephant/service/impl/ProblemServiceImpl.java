package com.youmias.elephant.service.impl;

import com.youmias.elephant.dao.ProblemMapper;
import com.youmias.elephant.dao.ProvinceMapper;
import com.youmias.elephant.po.Problem;
import com.youmias.elephant.service.ProblemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProblemServiceImpl implements ProblemService {

	@Autowired
	private ProblemMapper problemMapper;


	@Override
	public Problem getProblemById(String id) {
		return problemMapper.selectByPrimaryKey(id);
	}
}
