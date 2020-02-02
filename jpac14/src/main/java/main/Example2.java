package main;

import enitities.Product;

import javax.persistence.Persistence;

public class Example2 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = em.find(Product.class, 1);
        p.setName("Product 2");

        em.getTransaction().commit(); // UPDATE
        em.close();
    }
}
