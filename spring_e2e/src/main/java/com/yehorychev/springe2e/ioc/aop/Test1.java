package com.yehorychev.springe2e.ioc.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);
        Book book = context.getBean("book", Book.class);

//        schoolLibrary.getBook();
        universityLibrary.getBook();
        universityLibrary.getMagazine();
//        universityLibrary.returnMagazine();
//        universityLibrary.returnBook();
        universityLibrary.addBook("Yehor", book);
        universityLibrary.addMagazine();
//        universityLibrary.returnBook();
        context.close();
    }
}
