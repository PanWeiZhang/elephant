package com.youmias.elephant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


//指定mapper接口所在的 package
@MapperScan("com.youmias.elephant.dao")
//指定filters所在 package
@ServletComponentScan(basePackages = "com.youmias.elephant.filters")
@SpringBootApplication
public class ElephantApplication {

	public static void main(String[] args) { SpringApplication.run(ElephantApplication.class, args);  }

}
