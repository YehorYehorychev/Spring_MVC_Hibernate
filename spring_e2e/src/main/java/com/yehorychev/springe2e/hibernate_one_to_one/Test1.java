package com.yehorychev.springe2e.hibernate_one_to_one;

import com.yehorychev.springe2e.hibernate_one_to_one.entity.Details;
import com.yehorychev.springe2e.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Yehor", "Yehorychev", "IT", 280000);
//            Details details = new Details("Mountain View", "650-777-1818", "egor@google.com");
//            employee.setEmpDetail(details);
//
//            session.beginTransaction();
//            session.persist(employee); // persist == save
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Dwayne", "Carter", "Marketing", 135000);
//            Details details = new Details("Los Angeles", "640-211-1334", "lil@wayne.com");
//            employee.setEmpDetail(details);
//
//            session.beginTransaction();
//            session.persist(employee); // persist == save
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class, 1);
            session.remove(emp);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}