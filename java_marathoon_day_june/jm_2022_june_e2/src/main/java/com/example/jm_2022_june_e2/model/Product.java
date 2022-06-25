package com.example.jm_2022_june_e2.model;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public record Product(
    @Id int id,
    String name
) {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return id == product.id;
  }

  @Override
  public int hashCode() { /// HashSet
    return Objects.hash(id);
  }
}

// record: id() name()   ---> class: getId(), getName()
// public boolean equals(Object o) // this
// public String toString()