package com.laurentiuspilca.jpac13sb.services;

import com.laurentiuspilca.jpac13sb.entities.Product;
import com.laurentiuspilca.jpac13sb.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(String name) {
        Product p = new Product();
        p.setName(name);
        productRepository.save(p);
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }
}
