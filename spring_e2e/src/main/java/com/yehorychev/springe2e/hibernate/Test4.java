package com.yehorychev.springe2e.hibernate;

import com.yehorychev.springe2e.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // How can I update an employee's info from our DB?
            Session session = factory.getCurrentSession(); // we need to create a session first;
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            emp.setSalary(110000);

            // this is how you can change the salary for multiple employees
            session.createQuery("update Employee set salary = 300000 " +
                    "where name = 'Yehor'").executeUpdate();
            Employee emp = session.get(Employee.class, 2);

            session.getTransaction().commit(); // transaction closed

            System.out.println(emp);
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
