package com.qidian.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 /**
  * 
  * @title 注册中心
  * @author Xrt rong tao
  * @version 1.0.0
  * @since jdk1.8
  * @创建时间：2018年11月26日下午8:06:24
  * @功能描述：
  */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(EurekaServerApplication.class);
	}
}
