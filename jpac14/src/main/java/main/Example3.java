package main;

import enitities.Product;

import javax.persistence.Persistence;

public class Example3 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = em.find(Product.class, 1); // post load
        em.remove(p); // pre remove and post remove

        em.getTransaction().commit(); // DELETE
        em.close();
    }
}
