package com.example.jm_2022_june_e3.repositories;

import com.example.jm_2022_june_e3.entities.Product;
import com.example.jm_2022_june_e3.entities.dto.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

  // this one adds the fetched objects in the Hibernate context
  @Query(value = """
    SELECT p FROM Product p WHERE p.name = :name
  """)
  List<Product> findAllByName(String name);

  // this one does NOT add the fetched objects in the Hibernate context
  @Query(value = """
    SELECT new com.example.jm_2022_june_e3.entities.dto.ProductDto(p.id, p.name) FROM Product p WHERE p.name = :name
  """)
  List<ProductDto> findAllDtoByName(String name);
}
