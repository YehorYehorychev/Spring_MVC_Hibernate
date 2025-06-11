package com.yehorychev.springe2e.ioc.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student st1 = new Student("Yehor", 4, 4.5);
        Student st2 = new Student("Tanya", 3, 5.0);
        Student st3 = new Student("Aziz", 2, 2.2);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents() {
        System.out.println("getStudents() method starts..");
        System.out.println(students.get(3));
        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }
}
