package com.youmias.elephant.service;

import com.youmias.elephant.dao.*;
import com.youmias.elephant.po.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("infomationService")
public class InfomationService {

	@Autowired
	private TmpStudentMapper tmpStudentMapper;
	@Autowired
	private TmpCourseMapper tmpCourseMapper;
	@Autowired
	private ProvinceMapper provinceMapper;
	@Autowired
	private CityMapper cityMapper;
	@Autowired
	private CountyMapper countyMapper;
	@Autowired
	private IndustryFirstMapper industryFirstMapper;
	@Autowired
	private IndustryTwoMapper industryTwoMapper;


	/* 测试 */
	public TmpStudent getSyncService(){
		return tmpStudentMapper.getSyStudent();
	}

	public TmpCourse getSyncService2(){
		return tmpCourseMapper.selectCourse();
	}

	/*
	*
	*@Author zpw
	*@Time 2020-08-26
	*@Params null
	*@Describe 获取级联地区（3级-省市县）
	*
	*/

	public List<Province> getProvinces(){
		return provinceMapper.getProvinceList();
	}

	public Province getCitys(Integer pid){
		return provinceMapper.getCityList(pid);
	}

	public City getCountys(Integer cid){
		return cityMapper.getCountyList(cid);
	}


	/*
	 *
	 *@Author zpw
	 *@Time 2020-09-01
	 *@Params
	 *@Describe 获取级联所有地区（3级-省市县）
	 *
	 */

	public List<City> getAllCitys(){
		return cityMapper.getAllCitys();
	}

	public List<County> getAllCountys(){
		return countyMapper.getAllCountys();
	}


	/*
	 *
	 *@Author zpw
	 *@Time 2020-09-01
	 *@Params
	 *@Describe 获取行业
	 *
	 */

	public List<IndustryFirst> getFriIndustry(){
		return industryFirstMapper.getAideIndustryList();
	}

	public List<IndustryFirst> getFriIndustryList(){
		return industryFirstMapper.getFirList();
	}

	public List<IndustryTwo> getTwoIndustryList(){
		return industryTwoMapper.getTwoIndustryList();
	}

}
