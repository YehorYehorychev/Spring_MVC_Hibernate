package com.yehorychev.springe2e.ioc.springwithnoxmlconfig;

import com.yehorychev.springe2e.ioc.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

//        Person person = context.getBean("person", Person.class);
//        person.callYourPet();
//        Pet cat = context.getBean("catBean", Pet.class);
        Person person = context.getBean("personBean", Person.class);
        System.out.println("Person name: " + person.getName() + ", and age is: " + person.getAge());
        person.callYourPet();

        context.close();
    }
}
