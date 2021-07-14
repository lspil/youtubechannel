package main;

import entities.Event;
import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // EntityManagerFactory
        // EntityManager

        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em1 = emf.createEntityManager();

//        Product p1 = new Product();
//        p1.setName("Beer");
        
        Event e1 = new Event();
        e1.setDescription("ABCD");
        

        em1.getTransaction().begin();

//        em1.persist(p1); // adding the instance in the context
        em1.persist(e1);

        em1.getTransaction().commit();
        em1.close();

    }
}
