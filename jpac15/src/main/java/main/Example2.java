package main;

import entities.Product;

import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);

        Root<Product> product = query.from(Product.class);
        query.select(product);

        TypedQuery<Product> tq = em.createQuery(query);
        List<Product> result = tq.getResultList();

        result.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }
}
