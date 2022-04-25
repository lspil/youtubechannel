package com.example.smde11.services;

import com.example.smde11.entities.Product;
import com.example.smde11.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Transactional(propagation = Propagation.NOT_SUPPORTED)
  public Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }

  public void saveProduct(Product product) {
    productRepository.save(product);
  }

  public Optional<Product> findProductByName(String name) {
    return productRepository.findProductByName(name);
  }
}
