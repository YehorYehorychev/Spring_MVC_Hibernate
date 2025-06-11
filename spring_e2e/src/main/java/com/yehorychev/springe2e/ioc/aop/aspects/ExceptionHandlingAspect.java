package com.yehorychev.springe2e.ioc.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.yehorychev.springe2e.ioc.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: Attempting to catch exceptions..");
        System.out.println("---------------------------");
    }
}
