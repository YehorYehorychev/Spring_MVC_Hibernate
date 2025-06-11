package com.yehorychev.springe2e.ioc.annotationsexamples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("anotherPersonBean")
public class AnotherPerson {
    @Autowired
    private Human human;
    private String name;
    private int age;

/*    @Autowired
    public AnotherPerson(Human human) {
        System.out.println("AnotherPerson bean has created");
        this.human = human;
    }*/

    public AnotherPerson() {
        System.out.println("AnotherPerson bean has created");
    }

    public Human getHuman() {
        return human;
    }

    //    @Autowired
    public void setHuman(Human human) {
        this.human = human;
        System.out.println("Class AnotherPerson: setHuman");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void greetings() {
        System.out.println("Greetings method");
        human.sayHi();
    }
}
