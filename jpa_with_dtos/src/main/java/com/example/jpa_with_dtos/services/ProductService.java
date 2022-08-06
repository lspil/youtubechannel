package com.example.jpa_with_dtos.services;

import com.example.jpa_with_dtos.model.dtos.ProductDto;
import com.example.jpa_with_dtos.model.entities.Product;
import com.example.jpa_with_dtos.repositories.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

  private final ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> getAll() {
    var list = productRepository.findAll();
    list.forEach(p -> p.setPrice(1000));
    return list;
  }

  public List<ProductDto> getAllDtos() {
    var list = productRepository.findAllDto();
    list.forEach(p -> p.setPrice(1000));
    return list;
  }
}
