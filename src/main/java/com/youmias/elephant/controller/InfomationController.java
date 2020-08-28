package com.youmias.elephant.controller;

import com.youmias.elephant.po.City;
import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.po.IndustryTwo;
import com.youmias.elephant.po.Province;
import com.youmias.elephant.service.InfomationService;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("/info")
public class InfomationController{

	@Autowired
	@Qualifier("infomationService")
	private InfomationService infomationService;


	/*
	 *
	 *@Author zpw
	 *@Time 2020-08-28
	 *@Params '',pid,cid
	 *@Describe 获取级联地区（3级-省市县）
	 *
	 */

	@ResponseBody
	@RequestMapping(value = "/provinces",method = {RequestMethod.GET})
	public List<Province> getProvinces(){
		List<Province> provinceList = infomationService.getProvinces();
		return provinceList;
	}

	@ResponseBody
	@RequestMapping(value = "/citys",method = {RequestMethod.GET})
	public Province getCitys(Integer pid){
		Province cityList = infomationService.getCitys(pid);
		return cityList;
	}

	@ResponseBody
	@RequestMapping(value = "/countys",method = {RequestMethod.GET})
	public City getCountys(Integer cid){
		City countyList = infomationService.getCountys(cid);
		return countyList;
	}

}
