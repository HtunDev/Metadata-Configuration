package com.HAH.ioc;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public void getWorld() {
		System.out.println("I'm getting the World!");
	}

}
