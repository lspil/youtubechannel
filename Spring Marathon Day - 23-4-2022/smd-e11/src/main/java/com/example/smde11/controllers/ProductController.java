package com.example.smde11.controllers;

import com.example.smde11.entities.Product;
import com.example.smde11.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @GetMapping("/product")
  public Iterable<Product> getAllProducts() {
    return productService.getAllProducts();
  }

  @PostMapping("/product")
  public void saveProduct(@RequestBody Product product) {
     productService.saveProduct(product);
  }

  @GetMapping("/product/{name}")
  public ResponseEntity<Product> findProductByName(@PathVariable String name) {
    var p = productService.findProductByName(name);

    return p.map(ResponseEntity::ok)
            .orElse(ResponseEntity.noContent().build());
  }
}
