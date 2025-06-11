package com.yehorychev.springe2e.ioc;

import org.springframework.beans.factory.annotation.Value;

//@Component
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.name}")
    private String name;
    @Value("${person.age}") // Data from application.properties
    private int age;

    public Person(Pet pet) {
        System.out.println("Person bean has created");
        this.pet = pet;
    }

    //    public Person() {
//        System.out.println("Person bean has created");
//    }

//    @Autowired
//    public Person(@Qualifier("cat") Pet pet) { // -> Dependency Injection using constructor
//        System.out.println("Person bean has created");
//        this.pet = pet;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Person: setName");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Person: setAge");
    }

//    @Autowired
//    @Qualifier("cat")
    public void setPet(Pet pet) {
        System.out.println("Person: setPet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
