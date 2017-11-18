package com.zhanlearning.spring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// two available options
		//ArithmeticCalculator arithmeticCalculator = ctx.getBean(ArithmeticCalculator.class);
		ArithmeticCalculator arithmeticCalculator = (ArithmeticCalculator) ctx.getBean("arithmeticCalculator");
		
		System.out.println(arithmeticCalculator.getClass().getName());
		
		int result = arithmeticCalculator.add(6, 3);
		System.out.println("result: " + result);
		
		result = arithmeticCalculator.div(6, 3);
		System.out.println("result: " + result);
		
		result = arithmeticCalculator.div(6, 0);
		System.out.println("result: " + result);
	}
}
