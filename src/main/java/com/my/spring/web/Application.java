package com.my.spring.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.my.hr.Application;

@SpringBootApplication
@MapperScan("com.my.spring.web.**.map")
//@MapperScan("com.my.spring.web.**.dao.map")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*
		SpringApplication application = new SpringApplication(Application.class);
        application.setWebApplicationType(WebApplicationType.SERVLET);
        application.setBannerMode(Banner.Mode.OFF);     // 배너 감추기
        application.run(args);
        */
	}
}
