package com.youmias.elephant.controller;

import com.youmias.elephant.po.*;
import com.youmias.elephant.service.InfomationService;
import com.youmias.elephant.vo.Area;
import com.youmias.elephant.vo.Industry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

import static com.youmias.elephant.utils.ListToTreeUtil.generateTree;
import static com.youmias.elephant.utils.ListToTreeUtil.generateTree2;


@RestController
@RequestMapping("/info")
public class InfomationController extends BaseController{

	@Autowired
	private InfomationService infomationService;


	/*
	 *
	 *@Author zpw
	 *@Time 2020-08-28
	 *@Params '',pid,cid
	 *@Describe 分别获取级联地区（3级-省市县）
	 *
	 */

	@RequestMapping(value = "/provinces",method = {RequestMethod.GET})
	public List<Province> getProvinces(){
		List<Province> provinceList = infomationService.getProvinces();
		return provinceList;
	}

	@RequestMapping(value = "/citys",method = {RequestMethod.GET})
	public Province getCitys(String pid){
		Province cityList = infomationService.getCitys(pid);
		return cityList;
	}

	@RequestMapping(value = "/countys",method = {RequestMethod.GET})
	public City getCountys(String cid){
		City countyList = infomationService.getCountys(cid);
		return countyList;
	}

	/*
	 *
	 *@Author zpw
	 *@Time 2020-09-01
	 *@Params
	 *@Describe 获取所有地区（3级-省市县）
	 *
	 */

	@RequestMapping(value = "/allArea",method = {RequestMethod.GET})
	public Map<String,List> getAllArea(){

		Map<String,List> result = new HashMap<>();
		List<Area> eVoList = new ArrayList<>();

		List<Province> provinceList = infomationService.getProvinces();
		List<City> cityList = infomationService.getAllCitys();
		List<County> countyList = infomationService.getAllCountys();


		for(Province item : provinceList){
			Area temp = new Area();
			temp.setId(item.getId());
			temp.setNativeId(item.getId());
			temp.setLabel(item.getName());
			temp.setValue(item.getCode());
			temp.setParentId(item.getParentId());
			eVoList.add(temp);
		}

		for(City item : cityList){
			Area temp = new Area();
			temp.setId(item.getId());
			temp.setNativeId(item.getId());
			temp.setLabel(item.getName());
			temp.setValue(item.getCode());
			temp.setParentId(item.getParentId());
			eVoList.add(temp);
		}

		for(County item : countyList){
			Area temp = new Area();
			temp.setId(item.getId());
			temp.setNativeId(item.getId());
			temp.setLabel(item.getName());
			temp.setValue(item.getCode());
			temp.setParentId(item.getParentId());
			eVoList.add(temp);
		}

		List treeData = generateTree(eVoList);
		result.put("data", treeData);

		return result;
	}

	/*
	 *
	 *@Author zpw
	 *@Time 2020-09-01
	 *@Params
	 *@Describe 获取所有行业
	 *
	 */

	@RequestMapping(value = "/allIndustry",method = {RequestMethod.GET})
	public Map<String,List> getAllIndustry(){

		Map<String,List> result = new HashMap<>();
		List<Industry> eVoList = new ArrayList<>();

		List<IndustryFirst> ifList = infomationService.getFriIndustryList();
		List<IndustryTwo> itList = infomationService.getTwoIndustryList();

		int count = 1;

		for(IndustryFirst item : ifList){
			Industry temp = new Industry();
			temp.setId(count);
			temp.setNativeId(item.getId());
			temp.setLabel(item.getName());
			temp.setValue(item.getCode());
			temp.setParentId(item.getParentId());
			temp.setCreatedAt(item.getCreatedAt());
			temp.setUpdatedAt(item.getUpdatedAt());
			eVoList.add(temp);
			count++;
		}

		for(IndustryTwo item : itList){
			Industry temp = new Industry();
			temp.setId(count);
			temp.setNativeId(item.getId());
			temp.setLabel(item.getName());
			temp.setValue(item.getCode());
			temp.setParentId(item.getParentId());
			temp.setCreatedAt(item.getCreatedAt());
			temp.setUpdatedAt(item.getUpdatedAt());
			eVoList.add(temp);
			count++;
		}

		List treeData = generateTree2(eVoList);
		result.put("data", treeData);

		return result;
	}

}
