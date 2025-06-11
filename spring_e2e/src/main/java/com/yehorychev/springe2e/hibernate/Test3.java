package com.yehorychev.springe2e.hibernate;

import com.yehorychev.springe2e.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // How can I get an all employee's info from our DB?
            Session session = factory.getCurrentSession(); // we need to create a session first;
            session.beginTransaction();

//            List<Employee> employees = session.createQuery("from Employee")
//                    .getResultList(); // we're using a class name here -> from Employee | NOT the table name from DB

//            List<Employee> employees = session.createQuery("from Employee " + "where name = 'Yehor'")
//                    .getResultList();

            List<Employee> employees = session.createQuery("from Employee " + "where salary > 100000")
                    .getResultList();

            for (Employee e : employees) {
                System.out.println(e);
            }
            session.getTransaction().commit(); // transaction closed
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
