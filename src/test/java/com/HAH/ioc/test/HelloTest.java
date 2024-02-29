package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.HAH.ioc.HelloWorld;

public class HelloTest {
	
	@Test
	public void DemoTest() {
		var context = new ClassPathXmlApplicationContext("context.xml");
		context.refresh();
		context.refresh();
		var bean =context.getBean(HelloWorld.class);
		bean.getWorld();		
	}
}
