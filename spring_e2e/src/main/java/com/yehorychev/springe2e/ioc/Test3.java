package com.yehorychev.springe2e.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();
        System.out.println(person.getName() + " " + System.lineSeparator() + person.getAge());
        System.out.println();

        Pet tiger = context.getBean("myTiger", Tiger.class);
        tiger.say(); // init and destroy methods examples
        context.close();
    }
}
