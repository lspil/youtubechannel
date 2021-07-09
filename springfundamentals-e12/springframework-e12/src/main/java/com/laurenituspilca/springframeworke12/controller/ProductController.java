package com.laurenituspilca.springframeworke12.controller;

import java.awt.print.Pageable;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.laurenituspilca.springframeworke12.entities.Product;
import com.laurenituspilca.springframeworke12.repositories.ProductRepository;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    
    @PostMapping("/add")
    public void addProduct(@RequestBody Product p) {
        productRepository.save(p);
    }
    
    @GetMapping("/get/{name}")
    public List<Product> getProduct(@PathVariable String name) {
        return productRepository.findProductsByName(name);
    }

    @GetMapping("/sort")
    public Iterable<Product> getAllSortedDescendingById() {
        return productRepository.findAll(Sort.by("id").descending());
    }

    @GetMapping("/page/{page}")
    public List<Product> getProductsByPage(@PathVariable int page) {
        Sort s = Sort.by("id").descending();
        return productRepository.findAll(PageRequest.of(page, 3, s)).getContent();
    }

    @GetMapping("/name/{name}/{page}")
    public List<Product> getProductsByName(@PathVariable String name,
                                           @PathVariable int page) {
        org.springframework.data.domain.Pageable p = PageRequest.of(page, 2);
        return productRepository.findProductsByName(name);
    }
}
