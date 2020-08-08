package main;

import java.util.Comparator;
import java.util.function.Function;

public class Main {

  public static void main(String[] args) {
    Function<Animal, Fur> f = c -> new X();
    Comparator<Cat> comparator = Comparator.comparing(f);

  }

  static class Animal {
    String color;
    Fur fur;
  }

  static class Cat extends Animal {
    String name;
  }

  static class Fur implements Comparable<Fur> {

    @Override
    public int compareTo(Fur o) {
      return 0;
    }
  }

  static class X extends Fur { // X is a Fur

  }
}
