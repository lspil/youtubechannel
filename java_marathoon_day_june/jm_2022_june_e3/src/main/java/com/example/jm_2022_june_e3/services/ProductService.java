package com.example.jm_2022_june_e3.services;

import com.example.jm_2022_june_e3.entities.Product;
import com.example.jm_2022_june_e3.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
@Transactional   // PlatformTransactionManager
public class ProductService {

  private final ProductRepository productRepository;

  public List<Product> findProducts(String name) {
    return productRepository.findAllByName(name);
  }
}
