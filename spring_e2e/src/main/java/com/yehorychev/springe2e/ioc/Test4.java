package com.yehorychev.springe2e.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        // Scope: Singleton
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myDog", Dog.class);
        dog.setName("Deni");
        dog.say();

        Dog anotherDog = context.getBean("myDog", Dog.class);
        anotherDog.setName("Coco");
        anotherDog.say();

        System.out.println(dog.getName()); // Name -> Coco
        System.out.println(anotherDog.getName()); // Name -> Coco, because it's a singleton: only one object exists, and its name was changed

        /* In this example, I want to demonstrate that the Dog class is a singleton (all beans by default are singletons),
        meaning its object is created only once. Both dog and anotherDog refer to the same instance. */
        System.out.println("dog: " + dog);
        System.out.println("anotherDog: " + anotherDog);
        System.out.println(dog == anotherDog);
        System.out.println();

        /* Bean scopes in Spring:
        1. Singleton (default) – one shared instance per Spring container
        2. Prototype – a new instance is created every time the bean is requested
        3. Request – one instance per HTTP request (used in web apps)
        4. Session – one instance per HTTP session (used in web apps)
        5. Application – one instance per ServletContext (shared across sessions) */

        // Scope: Prototype
        Cat cat = context.getBean("myCat", Cat.class);
        cat.setName("Murzik");
        cat.say();

        Cat anotherCat = context.getBean("myCat", Cat.class);
        anotherCat.setName("Tom");
        anotherCat.say();

        System.out.println(cat.getName()); // Name -> Coco
        System.out.println(anotherCat.getName()); // Name -> Coco, because it's a singleton: only one object exists, and its name was changed

        /* In this example, I want to demonstrate that the Dog class is a singleton (all beans by default are singletons),
        meaning its object is created only once. Both dog and anotherDog refer to the same instance. */
        System.out.println("cat: " + cat);
        System.out.println("anotherCat: " + anotherCat);
        System.out.println(cat == anotherCat);

        context.close();
    }
}
