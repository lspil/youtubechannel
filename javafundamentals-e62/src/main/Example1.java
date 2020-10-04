package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example1 {

  public static void main(String[] args) {
    Path p1 = Paths.get("a/b/c");

    Path p2 = Paths.get("a", "b", "c");

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p1.getClass());
  }
}
