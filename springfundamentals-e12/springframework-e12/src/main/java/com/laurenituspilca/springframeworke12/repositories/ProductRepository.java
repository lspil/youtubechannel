package com.laurenituspilca.springframeworke12.repositories;

import com.laurenituspilca.springframeworke12.entities.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

//public interface ProductRepository extends JpaRepository<Product, Integer> {
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    List<Product> findProductsByName(String name);

//    @Query("select p from Product p where p.name=:name")
//    Product findProductsByName(String name);
}
