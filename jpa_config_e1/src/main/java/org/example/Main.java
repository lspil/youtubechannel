package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.entities.Product;

public class Main {

  public static void main(String[] args) {
    // emf
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");

    EntityManager em = null;

    try {
      emf.createEntityManager();

      TypedQuery<Product> q = em.createQuery("SELECT p FROM Product p", Product.class);

      var list = q.getResultList();

      list.forEach(p -> System.out.println(p));
    } finally {
      if (em != null) em.close();
    }
  }
}
