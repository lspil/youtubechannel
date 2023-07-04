package services;

import javax.management.RuntimeErrorException;

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
     * MANDATORY		you need already have a transaction already or else exception will be thrown
     * NEVER			you should not have a transaction already or else exception will be thrown
     * SUPPORTS			
     * NOT_SUPPORTED	the method will be executed without a transaction
     * NESTED	(Spring)
     *
     * a() ---> b()
     */

    @Autowired
    private ProductRepository productRepository;

    // @Transactional(propagation = Propagation.REQUIRED)		// default
    @Transactional
    public void addTenProducts() { // created
        for (int i=1; i<=10; i++) {
            productRepository.addProduct("Product " + i);
            if (i == 5) throw new RuntimeException(":(");
        }
    } // commits
}
