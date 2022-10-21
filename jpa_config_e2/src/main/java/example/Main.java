package example;

import example.config.DemoPersitenceUnit;
import example.entities.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // emf
    PersistenceUnitInfoDescriptor puid = new PersistenceUnitInfoDescriptor(new DemoPersitenceUnit());

    EntityManagerFactory emf =
        new EntityManagerFactoryBuilderImpl(puid, new HashMap<>()).build();


    EntityManager em = null;

    try {
      em = emf.createEntityManager();

      TypedQuery<Product> q = em.createQuery("SELECT p FROM Product p", Product.class);

      var list = q.getResultList();

      list.forEach(p -> System.out.println(p));
    } finally {
      if (em != null) em.close();
    }
  }
}
