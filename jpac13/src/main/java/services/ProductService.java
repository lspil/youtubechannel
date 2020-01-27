package services;

import entities.Product;
import repositories.ProductRepository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ProductService {

    private final EntityManagerFactory emf;

    public ProductService() {
        this.emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void addProduct(String name) {
        var em = emf.createEntityManager();
        var repository = new ProductRepository(em);

        Product p = new Product();
        p.setName(name);

        try {
            em.getTransaction().begin();
            repository.addProduct(p);
            em.getTransaction().commit();
        } catch (RuntimeException e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public List<Product> findProducts() {
        var em = emf.createEntityManager();
        var repository = new ProductRepository(em);

        return repository.findAllProducts();
    }
}
