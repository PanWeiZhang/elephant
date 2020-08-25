package com.youmias.elephant.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/get")
	public String info(){
		return "this is Spring Boot";
	}
}


