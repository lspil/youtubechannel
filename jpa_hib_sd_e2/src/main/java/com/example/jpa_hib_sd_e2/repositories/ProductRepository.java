package com.example.jpa_hib_sd_e2.repositories;

import com.example.jpa_hib_sd_e2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("""
      SELECT p FROM Product p WHERE p.name LIKE :name
  """)
  List<Product> findProductsByName(String name);
}
