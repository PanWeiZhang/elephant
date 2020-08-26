package com.youmias.elephant.controller;

import com.youmias.elephant.po.IndustryFirst;
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

}


