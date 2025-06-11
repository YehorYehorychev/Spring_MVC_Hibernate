package com.yehorychev.springe2e.ioc.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

/*   @Around is used when we want to run our custom logic
     both BEFORE and AFTER the target method execution.
     But unlike @Before or @After, here we must manually control
     when the target method is called — using the proceed() method.*/

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // This code runs BEFORE the target method (returnBook)
        System.out.println("Trying to return a book to the library..");

        long begin = System.nanoTime();
        Object methodResult = null;

        try {
            // proceed() runs the actual target method
            methodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.printf("aroundReturnBookLoggingAdvice: %s -> Exception was caught\n", e);
            throw e;
        }

        long end = System.nanoTime();
        double durationMs = (end - begin) / 1_000_000.0;

        // This code runs AFTER the target method has been executed
        System.out.println("aroundReturnBookLoggingAdvice: The book has been returned to the Library!");
        System.out.printf("aroundReturnBookLoggingAdvice: Execution time: %.3f milliseconds\n", durationMs);

        return methodResult; // we return the result from the target method
    }
}