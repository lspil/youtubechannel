package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Author;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String puName = "my-persistence-unit";
        Map<String, String> props = new HashMap<>();

        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "none"); // none create update

        EntityManagerFactory emf =
//                Persistence.createEntityManagerFactory("my-persistence-unit");
                new HibernatePersistenceProvider()
                        .createContainerEntityManagerFactory(
                                new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();  // Manager of a context

        try {
            // find
            // persist  --> adds to the context and marks the entity as to be inserted
            // remove   --> generates a deletion
            // merge    --> adds to the context a detached instance (an instance outside of the context)
            // detach   --> only take the instance out of the context
            // getReference -> only gets you a proxy to a specific instance
            // refresh -> re establish the data in the instance the way it is in the DB (undo)

            em.getTransaction().begin();

            Author a = em.find(Author.class, 1);

            a.getBooks()
                    .forEach(b -> System.out.println(b));

            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
            emf.close();
        }

        // Atomic, Consistent, Isolated, Durable
        // phantom reads, repeatable reads, dirty reads
        // serializable, repeatable read, read committed, read uncommitted

    }
}