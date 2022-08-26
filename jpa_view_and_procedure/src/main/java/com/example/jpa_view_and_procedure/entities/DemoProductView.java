package com.example.jpa_view_and_procedure.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "demo_product_view")
@Getter
@Setter
public class DemoProductView {

  @Id
  private int id;

  private String name;
}
