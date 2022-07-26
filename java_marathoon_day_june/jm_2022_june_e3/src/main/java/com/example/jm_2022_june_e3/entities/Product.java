package com.example.jm_2022_june_e3.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Product {

  @Id
  private int id;

  private String name;
}
