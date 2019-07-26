package com.laurentiuspilca.springfundamentalse11.repositories;

import com.laurentiuspilca.springfundamentalse11.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name=:name")
    public Product findProductByName(String name);
}
