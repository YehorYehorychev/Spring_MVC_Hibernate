package com.yehorychev.springe2e.ioc.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("Harry Potter")
    private String name;

    @Value("J.K. Rowling")
    private String author;

    @Value("1997")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
