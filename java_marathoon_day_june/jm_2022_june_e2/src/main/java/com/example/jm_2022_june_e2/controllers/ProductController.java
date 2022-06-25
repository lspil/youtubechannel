package com.example.jm_2022_june_e2.controllers;

import com.example.jm_2022_june_e2.model.Product;
import com.example.jm_2022_june_e2.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public record ProductController(
    ProductService productService
) {

  @GetMapping("/product/{name}")
  public List<Product> findAllProducts(@PathVariable String name) {
    return productService.findProducts(name);
  }
}
