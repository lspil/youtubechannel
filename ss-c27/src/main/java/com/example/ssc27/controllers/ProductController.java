package com.example.ssc27.controllers;

import com.example.ssc27.services.ProductService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/products/{username}")
  public List<String> findProductsForUsername(@PathVariable String username) {
    return productService.findProductsForUser(username);
  }

}
