package main;


import entities.Company;
import entities.Detail;
import entities.Product;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

        Product p = em.find(Product.class, 6);

//        Product p = new Product();
//        p.setName("Beer");
//        p.setPrice(5);
//        em.persist(p);

//        Detail d = new Detail();
//        d.setKcal(400);
//
//        d.setProduct(p);
//        p.setDetail(d);
//
//        em.persist(d);

//        Company c1 = new Company();
//        c1.setName("XYZ");
//        c1.setStreet("Street 1");
//        c1.setNumber("A1");
//        c1.setDetails("DETAILS");
//        em.persist(c1);

        em.getTransaction().commit();
        em.close();
    }
}
