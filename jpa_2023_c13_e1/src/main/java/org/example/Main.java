package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.entities.Customer;
import org.example.persistence.CustomPersistenceUnitInfo;
import org.hibernate.jpa.HibernatePersistenceProvider;

import java.util.HashMap;
import java.util.Map;

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

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<Object[]> cq = builder.createQuery(Object[].class);

            Root<Customer> customerRoot = cq.from(Customer.class);

//            cq.select(customerRoot); // SELECT c FROM Customer c
//            cq.select(customerRoot.get("name"));  // SELECT c.name FROM Customer c

            cq.multiselect(customerRoot.get("name"), builder.sum(customerRoot.get("id"))); // SELECT c.name, c.id FROM Customer c
            cq.where(builder.ge(customerRoot.get("id"), 5)); // WHERE c.id >= 5
            cq.groupBy(customerRoot.get("name"));
            cq.orderBy(builder.desc(customerRoot.get("id")));  // ORDER BY c.id DESC

            TypedQuery<Object[]> query = em.createQuery(cq);

            query.getResultList()
                    .forEach(o -> System.out.println(o[0] + " " + o[1]));

            em.getTransaction().commit(); // end of transaction
        } finally {
            em.close();
        }
    }
}