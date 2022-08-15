package com.example.two_big_problems_with_jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.repository.EntityGraph;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

  private double price;
}
