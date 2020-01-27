package com.laurentiuspilca.jpac13sb.repositories;

import com.laurentiuspilca.jpac13sb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE :name")
    List<Product> findProductsByName(String name);
}
