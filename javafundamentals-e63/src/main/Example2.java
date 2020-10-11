package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

  public static void main(String[] args) {
    Path p1 = Paths.get("C:/a/b/c/d");

    Path sp = p1.subpath(0, 3); // [0,3)

    System.out.println(sp);
  }
}
