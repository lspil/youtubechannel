package main;

import entities.*;
import entities.enums.PhoneType;

import javax.persistence.Persistence;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Person p = new Person();
//        p.setName("P1");
//        p.setPhoneNumber(new HashMap<>());
//
//        p.getPhoneNumber().put(PhoneType.MOBILE, "12345");
//        p.getPhoneNumber().put(PhoneType.HOME, "45678");
//
//        em.persist(p);

//        Student s1 = new Student();
//        s1.setName("S1");
//
//        Professor p1 = new Professor();
//        p1.setName("P1");
//        p1.setStudents(new HashMap<>());
//
//        p1.getStudents().put("calculus", s1);
//
//        em.persist(p1);
//        em.persist(s1);

//        Department d1 = new Department();
//        d1.setName("D1");
//
//        Employee e1 = new Employee();
//        e1.setName("E1");
//        e1.setDepartment(d1);
//
//        d1.setEmployees(new HashMap<>());
//        d1.getEmployees().put(0, e1);
//
//        em.persist(d1);
//        em.persist(e1);

        Department d = em.find(Department.class, 3);
        System.out.println(d.getEmployees());

        em.getTransaction().commit();
        em.close();
    }
}
