package com.example.jpa_view_and_procedure.controllers;

import com.example.jpa_view_and_procedure.entities.DemoProductView;
import com.example.jpa_view_and_procedure.repositories.DemoProductViewRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DemoController {

  private final DemoProductViewRepository productViewRepository;

  @GetMapping("/demo")
  public List<DemoProductView> findAll() {
    return productViewRepository.findAll();
  }

  @PostMapping("/product/{name}")
  public boolean addProduct(@PathVariable String name) {
    return productViewRepository.addProduct(name);
  }
}
