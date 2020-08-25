package com.youmias.elephant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//指定mapper接口所在的 package
@MapperScan("com.youmias.elephant.dao")
@SpringBootApplication
public class ElephantApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElephantApplication.class, args);
	}

}
