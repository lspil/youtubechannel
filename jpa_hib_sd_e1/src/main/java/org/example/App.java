package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.config.DemoPersistenceUnit;
import org.example.entities.Product;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor;

import java.util.HashMap;


public class App {
    public static void main( String[] args ) {
        var puid = new PersistenceUnitInfoDescriptor(new DemoPersistenceUnit());
        EntityManagerFactory emf = new EntityManagerFactoryBuilderImpl(
            puid, new HashMap<>()
        ).build();

        EntityManager em = emf.createEntityManager();
        TypedQuery<Product> q = em.createQuery("SELECT p FROM Product p WHERE p.name LIKE :name", Product.class);
        q.setParameter("name", "Beer");
        var products = q.getResultList();

        for (Product product : products) {
            System.out.println(product);
        }
    }
}
