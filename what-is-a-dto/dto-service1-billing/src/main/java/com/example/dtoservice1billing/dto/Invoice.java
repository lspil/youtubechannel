package com.example.dtoservice1billing.dto;

import java.util.List;

public class Invoice {

    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
