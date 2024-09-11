package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AreaMainClass {
	
	public static void main(String[] args) {
		
		String config = "classpath:appCTX4.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config);
		
		MyShape myShape = ctx.getBean("myShape", MyShape.class);
		
		myShape.triangleArea();
		myShape.revtanrgleArea();
	}
	
}
