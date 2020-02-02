package main;

import enitities.Product;

import javax.persistence.Persistence;

public class Example1 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = new Product();
        p.setName("Product 1");
        em.persist(p);

        em.getTransaction().commit();
        em.close();
    }
}
