package com.yehorychev.springe2e.ioc;

//@Component
public class Cat implements Pet {
    private String name;

    public Cat() {
        System.out.println("Cat bean has created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
