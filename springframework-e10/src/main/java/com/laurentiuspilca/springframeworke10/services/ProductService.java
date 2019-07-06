package com.laurentiuspilca.springframeworke10.services;

import com.laurentiuspilca.springframeworke10.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(String name) {
        productRepository.addProduct(name);
    }
}
