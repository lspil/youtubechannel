package com.example.smde12.controllers;

import com.example.smde12.entities.Product;
import com.example.smde12.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

  private final ProductService productService;

  @GetMapping
  public List<Product> findAllProduct() {
     return productService.getAllProducts();
  }
}
