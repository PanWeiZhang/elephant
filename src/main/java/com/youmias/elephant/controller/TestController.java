package com.youmias.elephant.controller;

import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.TmpCourse;
import com.youmias.elephant.po.TmpStudent;
import com.youmias.elephant.service.InfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

	@Autowired
	@Qualifier("infomationService")
	private InfomationService infomationService;


	@RequestMapping("/get")
	public String info(){
		return "this is Spring Boot";
	}


	/*
	*查询某学生所有科目的成绩
	 */
	@RequestMapping("/tSycn")
	public TmpStudent getTsycn(){
		TmpStudent stu = infomationService.getSyncService();
		return stu;
	}

	/*
	*查询某学生某一门科目的成绩
	 */
	@RequestMapping("/tNycc")
	public TmpCourse getTsycn2(){
		TmpCourse stu = infomationService.getSyncService2();
		return stu;
	}

}


