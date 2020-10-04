package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example4 {

  public static void main(String[] args) {
    Path p1 = Paths.get("a/b/c");
    Path p2 = Paths.get("d/e/f");

    Path p3 = p1.resolve(p2); // a/b/c/d/e/f

    System.out.println(p3);

    Path p4 = p2.resolve(p1); // d/e/f/a/b/c

    System.out.println(p4);
  }
}
