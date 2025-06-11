package com.yehorychev.springe2e.ioc.annotationsexamples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
//        Human man = context.getBean("manBean", Human.class);
//        man.sayHi();

        AnotherPerson anotherPerson = context.getBean("anotherPersonBean", AnotherPerson.class);
        anotherPerson.greetings();

        context.close();
    }
}
