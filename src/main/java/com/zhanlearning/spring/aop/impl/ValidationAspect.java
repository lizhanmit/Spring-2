package com.zhanlearning.spring.aop.impl;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
@Component
public class ValidationAspect {

	@Before("LoggingAspect.declareJoinPointExpression()")
	public void validateArgs(JoinPoint joinpoint) {
		System.out.println("-->validation: " + Arrays.asList(joinpoint.getArgs()));
	}
}
