package com.laurentiuspilca.jpac13sb.controllers;

import com.laurentiuspilca.jpac13sb.entities.Product;
import com.laurentiuspilca.jpac13sb.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/{name}")
    public void addProduct(@PathVariable("name") String name) {
        productService.addProduct(name);
    }

    @GetMapping("/get")
    public List<Product> findProducts() {
        return productService.findProducts();
    }
}
