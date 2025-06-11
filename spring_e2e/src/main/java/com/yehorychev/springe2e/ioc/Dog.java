package com.yehorychev.springe2e.ioc;

//@Component
//@Scope("singleton")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean has created");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    @PostConstruct
    public void init() {
        System.out.println("Class Dog: init method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Dog: destroy method");
    }*/
}
