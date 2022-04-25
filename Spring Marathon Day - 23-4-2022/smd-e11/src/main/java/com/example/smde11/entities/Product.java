package com.example.smde11.entities;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Product {

  @Id
  private int id;

  private String name;
  private BigDecimal price;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
