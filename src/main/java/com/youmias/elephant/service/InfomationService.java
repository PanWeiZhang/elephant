package com.youmias.elephant.service;


import com.youmias.elephant.po.*;

import java.util.List;

public interface InfomationService {

	/* 测试 */
	TmpStudent getSyncService();
	TmpCourse getSyncService2();

	List<Province> getProvinces();

	/***
	 * @param pid
	 * @return
	 */
	Province getCitys(Integer pid);

	/***
	 * @param cid
	 * @return
	 */
	City getCountys(Integer cid);

	List<City> getAllCitys();

	List<County> getAllCountys();

	List<IndustryFirst> getFriIndustry();

	List<IndustryFirst> getFriIndustryList();

	List<IndustryTwo> getTwoIndustryList();

}