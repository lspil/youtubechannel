package main;

import java.io.Serializable;

public class Owner implements Serializable {

  private String name;
  private transient Dog dog;

  public Owner(String name, Dog dog) {
    this.name = name;
    this.dog = dog;
  }

  @Override
  public String toString() {
    return "Owner{" +
        "name='" + name + '\'' +
        ", dog=" + dog +
        '}';
  }
}
