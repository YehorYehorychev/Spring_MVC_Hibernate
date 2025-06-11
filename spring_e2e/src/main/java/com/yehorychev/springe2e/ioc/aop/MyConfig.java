package com.yehorychev.springe2e.ioc.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.yehorychev.springe2e.ioc.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
