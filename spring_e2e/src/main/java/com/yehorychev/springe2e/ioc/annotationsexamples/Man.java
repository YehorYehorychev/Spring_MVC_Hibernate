package com.yehorychev.springe2e.ioc.annotationsexamples;

import org.springframework.stereotype.Component;

@Component("manBean")
public class Man implements Human {
    private String name;

    public Man() {
        System.out.println("Man bean has created");
    }

    @Override
    public void sayHi() {
        System.out.println("Greetings from the man!");
    }
}
