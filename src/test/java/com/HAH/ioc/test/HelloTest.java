package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.HAH.ioc.HelloWorld;

public class HelloTest {
	
//	@Test
//	public void DemoTest() {
//		var context = new GenericXmlApplicationContext();
//		context.load("context.xml");
//		context.refresh();
//		var bean =context.getBean(HelloWorld.class);
//		bean.getWorld();		
//	}
	@Test
	public void DemoTest() {
		var context = new GenericXmlApplicationContext("context.xml");
		var bean =context.getBean(HelloWorld.class);
		bean.getWorld();		
	}

}
