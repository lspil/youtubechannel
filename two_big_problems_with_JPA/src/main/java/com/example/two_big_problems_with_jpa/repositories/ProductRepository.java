package com.example.two_big_problems_with_jpa.repositories;

import com.example.two_big_problems_with_jpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
