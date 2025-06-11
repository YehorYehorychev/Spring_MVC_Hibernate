package com.yehorychev.springe2e.ioc.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

    @Pointcut("execution(* add*(..))")
    public void allAddMethods() {}
}