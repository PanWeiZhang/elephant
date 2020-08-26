package com.youmias.elephant.service;

import com.youmias.elephant.dao.*;
import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Component("infomationService")
public class InfomationService {

	@Autowired
	private IndustryFirstMapper industryFirstMapper;

	/*
	*
	*@Author zpw
	*@Time 2020-08-26
	*@Params null
	*@Describe 获取行业数据
	*
	*/

	public List<IndustryFirst> industryAllData(){
		return industryFirstMapper.queryInAll();
	}
}
