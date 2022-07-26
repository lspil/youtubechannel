package com.example.jm_2022_june_e2.repository;

import com.example.jm_2022_june_e2.model.Product;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

  // Native query -->> exactly how your DBMS understands it
  @Query("""
        SELECT * FROM product p 
        WHERE p.name = :name
  """)
  List<Product> findAllByName(String name);

}