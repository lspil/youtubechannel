package com.example.springacle1.controllers;

import com.example.springacle1.entities.Product;
import com.example.springacle1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/all")
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @GetMapping("/page/{page}")
    @PostFilter("hasPermission(filterObject, 'WRITE')")
    public List<Product> findProductsOnPage(@PathVariable int page) {
        Pageable pageable = PageRequest.of(page, 10);
        return productRepository.findAll(pageable).get()
                .collect(Collectors.toList());
    }
}
