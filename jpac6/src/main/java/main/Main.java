package main;


import entities.Department;
import entities.Document;
import entities.Employee;
import entities.Person;

import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Employee e1 = new Employee();
//        e1.setName("EMP 1");
//
//        Department d1 = new Department();
//        d1.setName("DEP 1");
//        d1.setEmployees(new ArrayList<>());
//        d1.getEmployees().add(e1);

//        em.persist(e1);
//        em.persist(d1);

        Person p1 = new Person();
        p1.setName("P1");
        p1.setDocuments(new ArrayList<>());

        Document d1 = new Document();
        d1.setName("DOC 1");

        d1.setPerson(p1);
        p1.getDocuments().add(d1);

        // any will do
//        em.persist(p1);
        em.persist(d1);

        em.getTransaction().commit();
        em.close();
    }
}
