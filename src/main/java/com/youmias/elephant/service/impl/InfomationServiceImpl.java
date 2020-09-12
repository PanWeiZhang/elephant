package com.youmias.elephant.service.impl;

import com.youmias.elephant.dao.*;
import com.youmias.elephant.po.*;
import com.youmias.elephant.service.InfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfomationServiceImpl implements InfomationService {

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
	@Override
	public TmpStudent getSyncService(){
		return tmpStudentMapper.getSyStudent();
	}

	@Override
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
	@Override
	public List<Province> getProvinces(){
		return provinceMapper.getProvinceList();
	}
	@Override
	public Province getCitys(String pid){
		return provinceMapper.getCityList(pid);
	}
	@Override
	public City getCountys(String cid){
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
	@Override
	public List<City> getAllCitys(){
		return cityMapper.getAllCitys();
	}
	@Override
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
	@Override
	public List<IndustryFirst> getFriIndustry(){
		return industryFirstMapper.getAideIndustryList();
	}
	@Override
	public List<IndustryFirst> getFriIndustryList(){
		return industryFirstMapper.getFirList();
	}
	@Override
	public List<IndustryTwo> getTwoIndustryList(){
		return industryTwoMapper.getTwoIndustryList();
	}

    @Override
    public IndustryFirst getIfst(Integer id) {
        return industryFirstMapper.selectByPrimaryKey(id);
    }

    @Override
    public IndustryTwo getItwst(Integer id) {
        return industryTwoMapper.selectByPrimaryKey(id);
    }

}
