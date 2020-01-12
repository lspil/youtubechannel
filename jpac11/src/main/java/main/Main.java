package main;

import entities.Product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    /*
    persist()
    flush()

    find()
    getReference()
    contains()

    remove()

    merge()
    refresh()

    detach()
    clear()
     */
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Product p = new Product();
//        p.setId(11);
//        p.setName("P1");
//
//        em.persist(p); // INSERT
//        em.flush();
//
//        System.out.println(":)");

//        Product p = em.find(Product.class, 10);

//        Product p = em.getReference(Product.class, 10);
//        System.out.println(p);

//        Product p = new Product();
//        p.setName("P2");
//        p.setId(50);
//        em.persist(p);
//        System.out.println(em.contains(p)); // true

//        Product p = em.find(Product.class, 50);
//        em.remove(p); // only works on managed instances

//        Product p = new Product();
//        p.setId(11);
//        em.merge(p);  // adds in the context the detached instance
//        System.out.println(em.contains(p)); //  false
//        em.remove(p);

//        Product p = em.find(Product.class, 11);
//        p.setName("A");
//        em.refresh(p);  // updates the instance with what we have in the DB
        // the name of p becomes again Y

        Product p1 = new Product();
        p1.setName("Q");
        p1.setId(100);
        em.persist(p1); // p1 is added to the context

        em.clear(); // takes all instances out of the context ( including p1 )
        //em.detach(p1); // takes p1 out of the context

        em.getTransaction().commit(); // the insert doesn't happen anymore
        em.close();
    }
}
