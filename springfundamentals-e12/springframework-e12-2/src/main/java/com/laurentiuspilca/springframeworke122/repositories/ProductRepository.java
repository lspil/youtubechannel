package com.laurentiuspilca.springframeworke122.repositories;

import com.laurentiuspilca.springframeworke122.model.Product;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("SELECT * FROM product WHERE name=:name")
    List<Product> findProductsByName(String name);
}
