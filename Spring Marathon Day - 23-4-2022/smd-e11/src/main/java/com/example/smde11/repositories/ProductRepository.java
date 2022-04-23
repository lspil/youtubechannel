package com.example.smde11.repositories;

import com.example.smde11.entities.Product;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Integer> {

  @Query("SELECT * FROM Product WHERE name = :name")
  Optional<Product> findProductByName(String name);

}
