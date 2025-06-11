package com.yehorychev.springe2e.ioc;

public class Tiger implements Pet {

    public Tiger() {
        System.out.println("Tiger bean has created");
    }

    @Override
    public void say() {
        System.out.println("ArrrrHhhrrr!");
    }

    public void init() {
        System.out.println("Tiger class: init");
    }

    public void destroy() {
        System.out.println("Tiger class: destroy");
    }
}
