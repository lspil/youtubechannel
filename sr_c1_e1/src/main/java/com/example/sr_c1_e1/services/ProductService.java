package com.example.sr_c1_e1.services;

import com.example.sr_c1_e1.model.Product;
import com.example.sr_c1_e1.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Service
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Flux<Product> getProducts() { // whole method takes 10 seconds to execute
    return productRepository.findAll() // 2 products
        .delayElements(Duration.ofSeconds(5)); // for any element add a sleep duration
  }
}
