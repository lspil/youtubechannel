package com.example.jpa_view_and_procedure.repositories;

import com.example.jpa_view_and_procedure.entities.DemoProductView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;

public interface DemoProductViewRepository extends JpaRepository<DemoProductView, Integer> {

  @Procedure(value = "addProduct", outputParameterName = "status")
  boolean addProduct(String name);

}
