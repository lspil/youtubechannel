package main;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Example3 {

  public static void main(String[] args) {
    CopyOnWriteArrayList<Integer> list
            = new CopyOnWriteArrayList<>();

    // any mutating operation (add, change reference in collection, remove)

    CopyOnWriteArraySet<Integer> set
            = new CopyOnWriteArraySet<>();
  }
}
