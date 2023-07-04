package main;

import entities.Professor;
import entities.Student;

import javax.persistence.Persistence;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Professor p1 = new Professor();
        p1.setName("Prof 1");

        Student s1 = new Student();
        s1.setName("Stud 1");

        p1.setStudents(new ArrayList<>());
        p1.getStudents().add(s1);

        s1.setProfessors(new ArrayList<>());
        s1.getProfessors().add(p1);

        em.persist(p1);
        em.persist(s1);

        em.getTransaction().commit();
        em.close();
    }
}
