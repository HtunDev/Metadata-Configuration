package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.HAH.ioc.HelloWorld;

public class HelloTest {
	
	@Test
	public void DemoTest() {
		var context = new FileSystemXmlApplicationContext("context.xml");
		context.refresh();
		var bean =context.getBean(HelloWorld.class);
		bean.getWorld();		
	}
}
