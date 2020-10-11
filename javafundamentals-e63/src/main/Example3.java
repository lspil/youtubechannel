package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {

  public static void main(String[] args) {
    Path p1 = Paths.get("b/c/d");
    Path p2 = Paths.get("b/q/w");

    // cd ../../q/w

    Path p3 = p1.relativize(p2);

    System.out.println(p3);
  }
}
