package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example4 {

  public static void main(String[] args) {
    Path p1 = Paths.get("C:/b/c/d"); // absolute
    Path p2 = Paths.get("b/q/w"); // relative

    Path p3 = p1.relativize(p2); // throws an exception

    System.out.println(p3);
  }
}
