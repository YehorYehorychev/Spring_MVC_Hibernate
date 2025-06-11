package com.yehorychev.springe2e.hibernate;

import com.yehorychev.springe2e.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // How can I get an employee's info from our DB?
            Session session = factory.getCurrentSession(); // we need to create a session first;
            session = factory.getCurrentSession(); // and we need to open the current session
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.getTransaction().commit(); // transaction closed

            System.out.println(employee);
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
