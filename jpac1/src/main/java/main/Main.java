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

        em1.getTransaction().begin();


        em1.getTransaction().commit();
        em1.close();

        em1.close();
    }
}
