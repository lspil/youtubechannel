package main;

import java.io.Serializable;

// java.io.Serializable
public class Cat implements Serializable {

  private final static long serialVersionUID = 2L; // is version 1

  private String name;
  private transient int age; // transient

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
