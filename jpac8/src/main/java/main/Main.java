package main;

import entities.*;

import javax.persistence.Persistence;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Department d1 = new Department();
//        d1.setName("Dep 1");
//
//        DepartmentDetails dd1 = new DepartmentDetails();
//        dd1.setContractNo("ABC123");
//        dd1.setDepartment(d1);
//
//        Employee e1 = new Employee();
//        e1.setName("Employee 1");
//        e1.setDepartmentDetails(dd1);
//
//        em.persist(e1);
//        em.persist(d1);

//        Professor p = new Professor();
//        p.setName("Prof 1");
//
//        ProfessorDetails pd1 = new ProfessorDetails();
//        pd1.setProfessors(Arrays.asList(p));
//
//        Student s1 = new Student();
//        s1.setName("Stud 1");
//        s1.setProfessorDetails(pd1);
//
//        em.persist(p);
//        em.persist(s1);

        Document d = new Document();
        d.setReference("ABC");
        d.setNumber("12345");

        Person p = new Person();
        p.setName("Person 1");
        p.setPhoneNumbers(Arrays.asList("123", "2334", "333"));
        p.setDocuments(Arrays.asList(d));

        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
}
