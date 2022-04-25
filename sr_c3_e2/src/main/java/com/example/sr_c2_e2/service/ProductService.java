package com.example.sr_c2_e2.service;

import com.example.sr_c2_e2.model.Product;
import com.example.sr_c2_e2.proxy.ProductProxy;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class ProductService {

  private final ProductProxy proxy;

  public ProductService(ProductProxy proxy) {
    this.proxy = proxy;
  }

  public Flux<Product> getAll() {
    return proxy.getAll();
  }
}
