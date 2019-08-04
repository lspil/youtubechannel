package com.laurentiuspilca.springframeworke123.repositories;

import com.laurentiuspilca.springframeworke123.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
