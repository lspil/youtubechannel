package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Example4 {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");

        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        CriteriaBuilder builder = em.getCriteriaBuilder();
//        CriteriaQuery<Product> query = builder.createQuery(Product.class);
//
//        //String jpql = "SELECT p FROM Product p WHERE p.price > :price";
//
//        var param = builder.parameter(Double.class, "price");
//
//        Root<Product> product = query.from(Product.class);
//        query.select(product).where(
//                builder.greaterThan(product.get("price"), param)
//        );

        CriteriaQuery<Product> query = buildProductCriteriaQuery(em);
        TypedQuery<Product> tq = em.createQuery(query);
        tq.setParameter("price", 10);
        List<Product> result = tq.getResultList();

        result.forEach(System.out::println);

        em.getTransaction().commit();
        em.close();
    }

    // WRONG!
    public List<Product> findProductsByPrice(EntityManager em, double price) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);

        Root<Product> product = query.from(Product.class);
        query.select(product).where(
                builder.greaterThan(product.get("price"), price)
        );

        TypedQuery<Product> tq = em.createQuery(query);
        List<Product> result = tq.getResultList();

        return result;
    }

    public static CriteriaQuery<Product> buildProductCriteriaQuery(EntityManager em) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Product> query = builder.createQuery(Product.class);

        var param = builder.parameter(Double.class, "price");

        Root<Product> product = query.from(Product.class);
        query.select(product).where(
                builder.greaterThan(product.get("price"), param)
        );

        return query;
    }
}
