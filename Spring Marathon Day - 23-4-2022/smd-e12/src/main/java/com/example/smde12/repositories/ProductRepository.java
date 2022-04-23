package com.example.smde12.repositories;

import com.example.smde12.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("SELECT p FROM Product p WHERE p.name = :name") // JPQL
  Optional<Product> findProductByName(String name);
}
