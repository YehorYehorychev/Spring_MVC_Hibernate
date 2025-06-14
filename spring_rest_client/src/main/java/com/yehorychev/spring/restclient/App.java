package com.yehorychev.spring.restclient;

import com.yehorychev.spring.restclient.configuration.MyConfig;
import com.yehorychev.spring.restclient.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

        List<Employee> allEmployees = communication.getAllEmployees();
        for (Employee e : allEmployees) {
            System.out.println(e);
        }

        Employee empById = communication.getEmployee(7);
        System.out.println("\n" + empById);

//        Employee emp = new Employee("Jake", "Paul", "Sales", 100000);
//        emp.setId(10);
//        communication.saveEmployee(emp);
//        communication.deleteEmployee(10);
    }
}
