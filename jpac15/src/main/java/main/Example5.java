package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);

        //String jpql = "SELECT p FROM Product p WHERE p.price > :min AND p.price < :max";

        var min = builder.parameter(Double.class, "min");
        var max = builder.parameter(Double.class, "max");

        Root<Product> product = query.from(Product.class);
        query.select(product).where(
                builder.and(
                        builder.greaterThan(product.get("price"), min),
                        builder.lessThanOrEqualTo(product.get("price"), max)
                        )
        );

        TypedQuery<Product> tq = em.createQuery(query);
        tq.setParameter("min", 10.0);
        tq.setParameter("max", 20.0);
        List<Product> result = tq.getResultList();

        result.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }

}
