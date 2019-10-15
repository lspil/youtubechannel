package com.example.springacle1.controllers;

import com.example.springacle1.entities.Product;
import com.example.springacle1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }


}
