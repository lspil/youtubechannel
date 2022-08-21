package com.example.jpa_hib_sd_e2.controllers;

import com.example.jpa_hib_sd_e2.entities.Product;
import com.example.jpa_hib_sd_e2.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductController {

  private final ProductRepository productRepository;

  @GetMapping("/products/{name}")
  public List<Product> findProducts(@PathVariable String name) {
    return productRepository.findProductsByName(name);
  }
}
