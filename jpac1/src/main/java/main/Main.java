package main;

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

        Product p1 = new Product();
        p1.setId(201);
        p1.setName("Beer");
        p1.setPrice(10.4);
        p1.setExpirationDate(LocalDate.now());

        em1.getTransaction().begin();

        em1.persist(p1); // adding the instance in the context

        em1.getTransaction().commit();
        em1.close();

        Product p2 = new Product();
        p2.setId(202);
        p2.setName("Beer");
        p2.setPrice(10.4);
        p2.setExpirationDate(LocalDate.now());

        var em2 = emf.createEntityManager();

        em2.getTransaction().begin();

        em2.persist(p2); // adding the instance in the context

        em2.getTransaction().commit();
        em2.close();
    }
}
