package com.yehorychev.springe2e.ioc.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("University: I took a book");
        System.out.println("---------------------------");
    }

    public void getMagazine() {
        System.out.println("University: I took a magazine");
        System.out.println("---------------------------");
    }

    public String returnBook() {
        int a = 10 % 0;
        System.out.println("The book has been returned to the University library");
        return "Gone Till November";
    }

    public void returnMagazine() {
        System.out.println("The magazine has been returned to the University library");
        System.out.println("---------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("University: The book was added");
        System.out.println("---------------------------");
    }

    public void addMagazine() {
        System.out.println("University: The magazine was added");
        System.out.println("---------------------------");
    }
}