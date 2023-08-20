package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Comment;
import org.example.entities.Post;
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
        props.put("hibernate.hbm2ddl.auto", "create"); // create, none, update


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Post p = new Post();
            p.setTitle("Post 1");
            p.setContent("Post 1 desc");

            Comment c1 = new Comment();
            c1.setContent("Content comment 1");

            Comment c2 = new Comment();
            c2.setContent("Content comment 2");

            p.setComments(List.of(c1, c2));
            c1.setPost(p);
            c2.setPost(p);

            em.persist(p);

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }

}