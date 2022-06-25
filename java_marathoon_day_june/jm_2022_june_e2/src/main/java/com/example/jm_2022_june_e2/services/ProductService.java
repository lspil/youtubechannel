package com.example.jm_2022_june_e2.services;

import com.example.jm_2022_june_e2.model.Product;
import com.example.jm_2022_june_e2.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional   // PlatformTransactionManager
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> findProducts(String name) {
    return productRepository.findAllByName(name);
  }
}
