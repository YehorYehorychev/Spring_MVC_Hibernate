package com.yehorychev.springe2e.hibernate_many_to_many;

import com.yehorychev.springe2e.hibernate_many_to_many.entity.Child;
import com.yehorychev.springe2e.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Section judoSection = new Section("Judo");
//            Section soccerSection = new Section("Soccer");
//            Section chessSection = new Section("Chess");
//            Child yehor = new Child("Yehor", 7);
//            Child tanya = new Child("Tetiana", 8);
//            Child bill = new Child("Bill", 10);
//
//            judoSection.addChildToSection(yehor);
//            judoSection.addChildToSection(bill);
//            soccerSection.addChildToSection(yehor);
//            soccerSection.addChildToSection(tanya);
//            chessSection.addChildToSection(bill);
//
//            session.beginTransaction();
//            session.persist(judoSection);
//            session.persist(soccerSection);
//            session.persist(chessSection);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            Section volleyballSection = new Section("Volleyball");
//            Child ann = new Child("Ann", 5);
//
//            ann.addSectionToChild(volleyballSection);
//
//            session.beginTransaction();
//            session.persist(ann);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 2);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 1);
//            System.out.println(child);
//            System.out.println(child.getSections());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 4);
//            session.remove(section);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
