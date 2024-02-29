package com.HAH.ioc.Configuration;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.HAH.ioc.HelloWorld;

@Configuration
public class HelloConfig {
	
	@Bean
	HelloWorld createHelloWorld() {
		return new HelloWorld();
	}

	@Bean
	Date createDate() {
		return new Date();
	}
}
