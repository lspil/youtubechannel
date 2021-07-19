package main;


import javax.persistence.Persistence;

import entities.Detail;
import entities.Product;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//      Company c1 = new Company();
//      c1.setName("XYZ");
//      c1.setStreet("Street 1");
//      c1.setNumber("A1");
//      //c1.setDetails("DETAILS");
//      em.persist(c1);
        
        Product p = em.find(Product.class, 5);

//        Product p = new Product();
//        p.setName("Beer");
//        p.setPrice(5);
////        em.persist(p);
//
//        Detail d = new Detail();
//        d.setKcal(400);
//
//        d.setProduct(p);
//        p.setDetail(d);
//        em.persist(d);

        em.getTransaction().commit();
        em.close();
    }
}
