package com.yehorychev.springe2e.ioc.aop.aspects;

import com.yehorychev.springe2e.ioc.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("*INFO:beforeGetStudentsLoggingAdvice: Logging retrieval of the student list before getStudents() method");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(JoinPoint joinPoint, List<Student> students) {
        Student firstStudent = students.get(0);
        String name = firstStudent.getName();
        name = "Mr. " + name;
        firstStudent.setName(name);
        double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);

        System.out.println("*INFO:beforeGetStudentsLoggingAdvice: Logging retrieval of the student list after getStudents() method");
    }

/*    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(JoinPoint joinPoint, Throwable exception) {
        System.out.println("*Exception:afterThrowingGetStudentsLoggingAdvice: Logging exception throwing in getStudents() method: " + exception);
    }*/

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("*INFO:afterGetStudentsLoggingAdvice: Logging normal method completion or exception thrown");
    }
}
