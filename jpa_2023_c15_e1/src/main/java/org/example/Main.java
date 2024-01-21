package org.example;

import jakarta.persistence.EntityGraph;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Subgraph;
import org.example.entities.Author;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        String puName = "pu-name";

        Map<String, String> props = new HashMap<>();
        props.put("hibernate.show_sql", "true");
        props.put("hibernate.hbm2ddl.auto", "none"); // create, none, update


        EntityManagerFactory emf = new HibernatePersistenceProvider()
                .createContainerEntityManagerFactory(new CustomPersistenceUnitInfo(puName), props);

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Author -> Book -> BookShop

//            EntityGraph<?> graph = em.createEntityGraph(Author.class);
//            Subgraph<?> bookSubgraph = graph.addSubgraph("booksList");
//            bookSubgraph.addAttributeNodes("bookShopList");

            EntityGraph<?> graph = em.getEntityGraph("Author.eagerlyFetchBookShops");

            em.createQuery("SELECT a FROM Author a", Author.class)
                            .setHint("jakarta.persistence.loadgraph", graph)
                            .getResultList()
                                    .forEach(a ->
                                            System.out.println(
                                                a.getBooksList().stream().map(b -> b.getBookShopList()).collect(Collectors.toList())
                                            )
                                    );

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}