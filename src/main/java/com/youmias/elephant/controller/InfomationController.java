package com.youmias.elephant.controller;

import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import com.youmias.elephant.service.InfomationService;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/info")
public class InfomationController{

	@Autowired
	@Qualifier("infomationService")
	private InfomationService infomationService;

	@ResponseBody
	@RequestMapping(value = "/industry",method = {RequestMethod.GET})
	public List<IndustryTwo> getAllIndustry(){
		Integer p = 8;
		List<IndustryTwo> s = infomationService.industryAllData(p);
		return s;
	}

	@ResponseBody
	@RequestMapping(value = "/industryu",method = {RequestMethod.GET})
	public List<IndustryFirst> getAllIndustrys(){
		List<IndustryFirst> y = infomationService.industryAllDataaaa();
		return y;
	}

}
