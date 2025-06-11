package com.yehorychev.springe2e.hibernate_one_to_one;

import com.yehorychev.springe2e.hibernate_one_to_one.entity.Details;
import com.yehorychev.springe2e.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
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
//            Employee employee = new Employee("Mike", "Tyson", "Sales", 100000);
//            Details details = new Details("New-York", "845-7777-6666", "tyson@gmail.com");
//            employee.setEmpDetail(details);
//            details.setEmployee(employee);
//
//            session.beginTransaction();
//            session.persist(details); // persist == save
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Details det = session.get(Details.class, 3);
//            System.out.println(det);
//            System.out.println(det.getEmployee());
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Details det = session.get(Details.class, 2);
//            session.remove(det);
//            session.getTransaction().commit();
//
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Details det = session.get(Details.class, 3);
            det.getEmployee().setEmpDetail(null);
            session.remove(det);
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