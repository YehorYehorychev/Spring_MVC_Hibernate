package com.yehorychev.springe2e.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean(Person.class);
        person.callYourPet();
        System.out.println(person.getName() + " is the name, and the age is: " + person.getAge());

        context.close();
    }
}
