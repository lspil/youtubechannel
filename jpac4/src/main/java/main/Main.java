package main;

import javax.persistence.Persistence;

import entities.Person;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        
//        Company c = new Company();
//        c.setName("ABC");
//        c.setAddress(new Address());
//
//        c.getAddress().setNo("4");
//        c.getAddress().setStr("Some Street");
//        c.getAddress().setCity("London");

//        Department d = new Department();
//        d.setName("DEP 1");
//        d.setCode("QWE");
//        d.setNo(11);
//        em.persist(d);

//        Building b = new Building();
//        b.setName("B1");
//        b.setId(new BuildingPK());
//        b.getId().setCode("ABC");
//        b.getId().setNo(20);
//        em.persist(b);

        Person p1 = new Person();
        p1.setName("P1");
        em.persist(p1);

        em.getTransaction().commit();
        em.close();
    }
}
