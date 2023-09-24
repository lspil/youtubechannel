package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Group;
import org.example.entities.User;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String puName = "pu-name";

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
//        props.put("hibernate.hbm2ddl.auto", "none"); // create, none, update


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            User u1 = new User();
            u1.setName("User 1");

            User u2 = new User();
            u2.setName("User 2");

            Group g1 = new Group();
            g1.setName("Group 1");

            Group g2 = new Group();
            g2.setName("Group 2");

            g1.setUsers(List.of(u1, u2));
            g2.setUsers(List.of(u2));

            u1.setGroups(List.of(g1));
            u2.setGroups(List.of(g1, g2));

            em.persist(g1);
            em.persist(g2);

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}