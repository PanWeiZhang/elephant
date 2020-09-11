package com.youmias.elephant.controller;

import com.youmias.elephant.po.Problem;
import com.youmias.elephant.service.ProblemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ProblemController extends BaseController{

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
    private ProblemService problemService;

	/**
	 * @Dec 根据id查问题
	 * @Author zpw
	 * @Time 2020-09-11
	 *
	 */

	@GetMapping("/secure/selectById")
	public Map<String, Object> selectProblemFn(@RequestParam(name = "id") String id){
		try{
			Map<String,Object> map = new HashMap<>();
			Problem item = problemService.getProblemById(id);
			map.put("data",item);
			map.put("msg","成功");
			map.put("status","success");
			map.put("code","200");
			return  map;
		}catch (RuntimeException e){
			throw new RuntimeException(e);
		}
	}

}
