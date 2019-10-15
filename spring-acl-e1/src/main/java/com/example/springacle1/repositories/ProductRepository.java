package com.example.springacle1.repositories;

import com.example.springacle1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.access.prepost.PostFilter;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @PostFilter("hasPermission(filterObject, 'WRITE')")
    List<Product> findAll();

}
