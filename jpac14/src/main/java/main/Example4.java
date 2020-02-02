package main;

import enitities.Product;

import javax.persistence.Persistence;

public class Example4 {

        public static void main(String[] args) {
            var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

            var em = emf.createEntityManager();

            em.getTransaction().begin();

            Product p = em.find(Product.class, 2); // goes to L2 cache

            // CACHE
            var cache = emf.getCache();
            System.out.println(cache.contains(Product.class, 2)); // false

            em.getTransaction().commit();
            em.close();
        }
}
