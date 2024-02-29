package com.HAH.ioc.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.HAH.ioc.HelloWorld;

public class HelloTest {
	
	@Test
	public void DemoTest() {
		var context = new AnnotationConfigApplicationContext();
		context.register(HelloWorld.class);
		//context.scan("com.HAH.ioc.HelloWorld");
		context.refresh();
		var bean =context.getBean(HelloWorld.class);
		bean.getWorld();		
	}
//	@Test
//	public void DemoTest() {
//		var context = new AnnotationConfigApplicationContext(HelloWorld.class);
//		var bean =context.getBean(HelloWorld.class);
//		bean.getWorld();		
//	}
}
