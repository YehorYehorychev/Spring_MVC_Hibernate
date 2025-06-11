package com.yehorychev.springe2e.hibernate_one_to_many_bi;


import com.yehorychev.springe2e.hibernate_one_to_many_bi.entity.Department;
import com.yehorychev.springe2e.hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("IT", 300000, 65000);
//            Department department2 = new Department("Sales", 200000, 55000);
//            Employee emp1 = new Employee("Yehor", "Yehorychev", 300000);
//            Employee emp2 = new Employee("Tetiana", "Babaian", 145000);
//            Employee emp3 = new Employee("Mark", "Jacobs", 170000);
//            Employee emp4 = new Employee("Chris", "Brown", 110000);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department2.addEmployeeToDepartment(emp3);
//            department2.addEmployeeToDepartment(emp4);
//
//            session.beginTransaction();
//            session.persist(department);
//            session.persist(department2);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 5);
            System.out.println("Show department");
            System.out.println(department);
            System.out.println("Get employees of the department");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            session.remove(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            if (session != null) {
                session.close();
            }
            factory.close();
        }
    }
}