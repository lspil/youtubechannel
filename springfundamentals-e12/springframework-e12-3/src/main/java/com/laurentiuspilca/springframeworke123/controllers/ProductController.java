package com.laurentiuspilca.springframeworke123.controllers;

import com.laurentiuspilca.springframeworke123.model.Product;
import com.laurentiuspilca.springframeworke123.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/add/{name}")
    public void addProduct(@PathVariable String name) {
        Product p = new Product();
        p.setName(name);
        productRepository.save(p);
    }

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
