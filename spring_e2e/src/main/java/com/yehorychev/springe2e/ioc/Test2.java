package com.yehorychev.springe2e.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myDog", Pet.class);
        Pet pet2 = context.getBean("myCat", Pet.class);
        pet.say();
        pet2.say();

        context.close();
    }
}
