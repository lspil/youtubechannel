package main;


import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Event;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Price p = new Price();
//        p.setAmount(100);
//        p.setCurrency(Currency.USD);
//        em.persist(p);

//        Product p = new Product();
//        p.setExpDate(LocalDate.now());
//        em.persist(p);

        Event e = new Event();
        //e.setEventTime(LocalDateTime.now());
        e.setEventTime(ZonedDateTime.now(ZoneId.of("America/New_York")));
        em.persist(e);

//        Employee e = new Employee();
//        e.setEmpDate(new Date());
//        em.persist(e);

//        Company c = new Company();
//        c.setName("ABC");
//        c.setAddress(new Address());
//
//        c.getAddress().setNumber("4");
//        c.getAddress().setStreet("Some Street");
//        c.getAddress().setCity("London");

        em.getTransaction().commit();
        em.close();
    }
}
