package com.youmias.elephant.controller;

import com.youmias.elephant.po.IndustryFirst;
import com.youmias.elephant.service.InfomationService;
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
	public List<IndustryFirst> getAllIndustry(){

		HashMap<String,Object> map = new HashMap<>();
		List industryList = infomationService.industryAllData();

//		for (Object item : industryList) {
//			//每次循环找到每个节点的子节点们（f代表符合条件的集合），并挂载到当前节点下
//			List<Object> children = industryList.stream().filter(f -> item.().equals(f.getParentId())).collect(Collectors.toList());
//			l.setChildrens(children);
//		}
//		//for循环结束，整棵树挂载完毕，需要找到树的根节点（此例定义parentId为0就是根节点）
//		List<DepartmentVO> rootNodes = list.stream()
//				.filter(f -> f.getParentId() == "0" || Objects.isNull(f.getParentId())).collect(Collectors.toList());
//
//
//		for(Object item : industryList){
//			System.out.println(item);
//		}
		return industryList;
//		return null;
	}

}
