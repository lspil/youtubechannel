package com.laurenituspilca.springframeworke12.controller;

import com.laurenituspilca.springframeworke12.entities.Product;
import com.laurenituspilca.springframeworke12.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

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
        Pageable p = PageRequest.of(page, 2);
        return productRepository.findProductsByName(name, p);
    }
}
