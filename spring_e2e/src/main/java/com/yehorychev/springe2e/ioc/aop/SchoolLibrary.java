package com.yehorychev.springe2e.ioc.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("School: I took a book!");
    }
}
