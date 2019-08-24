package com.laurentiuspilca.springframeworke15.repositories;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepository {

    public List<String> getProductNames() {
        return Arrays.asList("aa", "bbb", "cccc", "ddddd");
    }

    public void addProduct(String name) {

    }
}
