package org.example;

import jakarta.persistence.*;
import org.example.entities.Product;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

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

            // SELECT, UPDATE, DELETE

            /*
//               String jpql = "SELECT p FROM Product p";
//               String jpql = "SELECT p FROM Product p WHERE p.price > 5";
               String jpql = "SELECT p FROM Product p WHERE p.price > :price AND p.name LIKE :name";

//             SELECT p FROM Product p  ===> Fetch all the attributes of the Product entity from the current context
//             SELECT * FROM Product   ===> Fetch all the columns from the table product

           TypedQuery<Product> q = em.createQuery(jpql, Product.class);

            q.setParameter("price", 3);
            q.setParameter("name", "%a%");  // LIKE

            List<Product> productList = q.getResultList();

            for (Product p : productList) {
                System.out.println(p);
            }
             */

            /*
            String jpql = "SELECT AVG(p.price) FROM Product p"; // AVG, SUM, MIN, MAX ....

            TypedQuery<Double> q = em.createQuery(jpql, Double.class);

            Double avg = q.getSingleResult();

            System.out.println(avg);
            */

            /*
            String jpql = "SELECT COUNT(p) FROM Product p"; // AVG, SUM, MIN, MAX ....

            TypedQuery<Long> q = em.createQuery(jpql, Long.class);

            Long avg = q.getSingleResult();

            System.out.println(avg);
             */

            /*
            String jpql = """
                    SELECT p.name, AVG(p.price) 
                    FROM Product p GROUP BY p.name
                    """;

            TypedQuery<Object[]> q = em.createQuery(jpql, Object[].class);

            q.getResultList().forEach(objects -> {
                System.out.println(objects[0] + " " + objects[1]);
            });
*/

            String jpql = "SELECT p FROM Product p WHERE p.name LIKE 'Candy'";

            TypedQuery<Product> q = em.createQuery(jpql, Product.class);

            Optional<Product> p;
            try {
                p = Optional.of(q.getSingleResult());
            } catch (NoResultException e) {
                p = Optional.empty();
            }

            p.ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Product not found")
            );

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}