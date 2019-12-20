package main;

import entities.*;

import javax.persistence.Embeddable;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Animal a = new Animal();
//        a.setName("A");
//
//        Cat c = new Cat();
//        c.setName("B");
//        c.setColor("Black");
//
//        em.persist(a);
//        em.persist(c);

//        Product p = new Product();
//        p.setName("P");
//
//        Chocolate c = new Chocolate();
//        c.setName("C");
//        c.setkCal(100);
//
//        em.persist(p);
//        em.persist(c);

//        Employee e = new Employee();
//        e.setId(1);
//        e.setName("Bill");
//
//        Manager m = new Manager();
//        m.setId(2);
//        m.setName("Mary");
//        m.setResponsibility("smth");
//
//        em.persist(e);
//        em.persist(m);

        Car c = new Car();
        c.setColor("Black");
        c.setGas("Diesel");

        Bicycle b = new Bicycle();
        b.setColor("Red");
        b.setModel("BMX");

        em.persist(c);
        em.persist(b);

        em.getTransaction().commit();
        em.close();
    }
}
