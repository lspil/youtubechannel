package main;

import java.io.Serializable;

public class Cat implements Serializable {

  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
