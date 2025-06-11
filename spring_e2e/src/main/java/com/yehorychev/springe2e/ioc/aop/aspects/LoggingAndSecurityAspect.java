package com.yehorychev.springe2e.ioc.aop.aspects;

import com.yehorychev.springe2e.ioc.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
    Spring AOP:

    1. @Aspect
       - Marks a class as an Aspect (where you define cross-cutting concerns like logging, security, etc.).

    2. @Pointcut("expression")
       - Defines a reusable expression that selects join points (method executions, constructors, etc.).
       - Examples:
         execution(* get*()) — any method starting with "get"
         execution(* com.example.MyClass.*(..)) — any method in MyClass

    3. @Before("pointcutName()")
       - Runs BEFORE the matched method execution.
       - Used for logging, permission checks, etc.

    4. @After("pointcutName()")
       - Runs AFTER the matched method (even if it throws an exception).

    5. @AfterReturning("pointcutName()")
       - Runs ONLY AFTER the method successfully completes (no exception thrown).

    6. @AfterThrowing("pointcutName()")
       - Runs ONLY IF the method throws an exception.

    7. @Around("pointcutName()")
       - Wraps the method execution.
       - Gives full control: you can run code BEFORE and AFTER the method, and even skip or modify execution.

    ===== Example =====
    @Pointcut("execution(* getBook(..))")
    private void getBookMethod() {}

    @Before("getBookMethod()")
    public void beforeGetBookAdvice() {
        System.out.println("Advice before getBook is called");
    }

    Summary:
    - Pointcut: defines WHERE the advice should run.
    - Advice (@Before, @After, etc.): defines WHAT to do.
    - Aspect: a class that holds pointcuts and advices.
*/

@Component
@Aspect
@Order(1)
public class LoggingAndSecurityAspect {

//    @Pointcut("execution(* *(..))")
//    private void allMethodsFromUniversityLibrary() {}
//
//    @Pointcut("execution(* com.yehorychev.springe2e.ioc.aop.UniversityLibrary.returnMagazine()))")
//    private void returnMagazineFromUniversityLibrary() {}
//
//    @Pointcut("allMethodsFromUniversityLibrary() && !returnMagazineFromUniversityLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniversityLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniversityLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }

//    @Pointcut("execution(* get*())")
//    private void allGetMethodsFromUniversityLibrary() {}
//
//    @Pointcut("execution(* return*())")
//    private void allReturnMethodsFromUniversityLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniversityLibrary() || allReturnMethodsFromUniversityLibrary()") // Combined Pointcut
//    private void allGetAndReturnMethodsFromUniversityLibrary() {}
//
//    @Before("allGetMethodsFromUniversityLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniversityLibrary()")
//    public void beforeAllReturnLoggingAdvice() {
//        System.out.println("beforeAllReturnLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniversityLibrary()")
//    public void beforeAllGetAndReturnMethodsLoggingAdvice() {;
//        System.out.println("beforeAllGetAndReturnMethodsLoggingAdvice: writing Log #3");
//    }

//    @Before("execution(public void com.yehorychev.springe2e.ioc.aop.UniversityLibrary.getBook())")
//    @Before("execution(public void getBook())")
//    @Before("execution(public void get*(String))")
//    @Before("execution(public void *(*))") // any method with 1 parameter(any type)
//    @Before("execution(public void *(..))") // any method with any parameters(any type, and can be multiple parameters, even 0 parameters)
//    @Before("execution(public void getBook(com.yehorychev.springe2e.iocexamples.aop.Book, ..))") // the first parameter should be Book(type), and others parameters can have any type

    @Before("com.yehorychev.springe2e.ioc.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature.getName(): " + methodSignature.getName());
        System.out.println("methodSignature: " + methodSignature);
        System.out.println("methodSignature.getMethod(): " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType(): " + methodSignature.getReturnType());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Book Info(name): " + myBook.getName());
                    System.out.println("Book Info(author): " + myBook.getAuthor());
                    System.out.println("Book Info(year of publication): " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("The book was added by " + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: Logging -> Attempting to get a book/magazine");
        System.out.println("---------------------------");
    }
}