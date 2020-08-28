package com.youmias.elephant.service;

import com.youmias.elephant.dao.*;
import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import com.youmias.elephant.po.TmpCourse;
import com.youmias.elephant.po.TmpStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component("infomationService")
public class InfomationService {

	@Autowired
	private IndustryTwoMapper industryTwoMapper;
	@Autowired
	private IndustryFirstMapper industryFirstMapper;
	@Autowired
	private TmpStudentMapper tmpStudentMapper;
	@Autowired
	private TmpCourseMapper tmpCourseMapper;



	/*
	*
	*@Author zpw
	*@Time 2020-08-26
	*@Params null
	*@Describe 获取行业数据
	*
	*/

	public List<IndustryTwo> industryAllData(Integer ai){
		List<IndustryTwo> lp = industryTwoMapper.cumtorKey(ai);
		return lp;
	}

	public List<IndustryFirst> industryAllDataaaa(){

		List<IndustryFirst> po = industryFirstMapper.onetomore();
		return po;
	}

	public TmpStudent getSyncService(){
		return tmpStudentMapper.getSyStudent();
	}

	public TmpCourse getSyncService2(){
		return tmpCourseMapper.selectCourse();
	}

}
