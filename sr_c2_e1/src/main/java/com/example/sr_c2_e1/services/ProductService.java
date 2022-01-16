package com.example.sr_c2_e1.services;

import com.example.sr_c2_e1.model.Product;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;

@Service
public class ProductService {

  public Flux<Product> getAll() {
    var p1 = new Product();   // from DB
    p1.setName("Beer");
    var p2 = new Product();
    p2.setName("Chocolate");

    Flux<Product> proucts =
        Flux.fromStream(List.of(p1, p2).stream())
            .delayElements(Duration.ofSeconds(3)); // simulate something happens with each product

    return proucts;
  }
}
