package com.yehorychev.springe2e.hibernate;

import com.yehorychev.springe2e.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            // How can I delete an employee's info from our DB?
            Session session = factory.getCurrentSession(); // we need to create a session first;
            session.beginTransaction();

            // If we want to delete just 1 object from DB
            Employee emp = session.get(Employee.class, 4);
            session.remove(emp);

            // If we want to delete multiple objects from DB
//            session.createQuery("delete Employee " +
//                    "where name = Yehor").executeUpdate();


            session.getTransaction().commit(); // transaction closed

            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
