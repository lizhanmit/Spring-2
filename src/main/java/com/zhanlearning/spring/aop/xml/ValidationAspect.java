package com.zhanlearning.spring.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;

public class ValidationAspect {

	public void validateArgs(JoinPoint joinpoint) {
		System.out.println("-->validation: " + Arrays.asList(joinpoint.getArgs()));
	}
}
