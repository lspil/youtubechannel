package com.example.jpa_with_dtos.repositories;

import com.example.jpa_with_dtos.model.dtos.ProductDto;
import com.example.jpa_with_dtos.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  @Query("""
      SELECT p FROM Product p
      """)
  List<Product> findAll(); // taking entities and putting them in the JPA context

  @Query("""
      SELECT new com.example.jpa_with_dtos.model.dtos.ProductDto(p.id, p.name, p.price) FROM Product p
      """)
  List<ProductDto> findAllDto(); // taking objects and putting them outside of the JPA context
}
