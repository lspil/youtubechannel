package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import repositories.ProductRepository;

@Service
public class ProductService {
    /**
     * REQUIRED (default)
     * REQUIRES_NEW
     * MANDATORY
     * NEVER
     * SUPPORTS
     * NOT_SUPPORTED
     * NESTED
     *
     * a() ---> b()
     */

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    public void addTenProducts() { // created
        for (int i=1; i<=10; i++) {
            productRepository.addProduct("Product " + i);
        }
    } // commits
}
