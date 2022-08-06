package com.example.jpa_with_dtos.controllers;

import com.example.jpa_with_dtos.model.dtos.ProductDto;
import com.example.jpa_with_dtos.model.entities.Product;
import com.example.jpa_with_dtos.services.ProductService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/all")
  public List<Product> getAll() {
    return productService.getAll();
  }

  @GetMapping("/alldtos")
  public List<ProductDto> getAllDtos() {
    return productService.getAllDtos();
  }
}
