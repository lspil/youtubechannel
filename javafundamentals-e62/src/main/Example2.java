package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

  public static void main(String[] args) {
    Path p1 = Paths.get("a/b/c/d"); // relative
    Path p2 = Paths.get("/c/d"); // absolute
    Path p3 = Paths.get("C:/a/b/c"); // absolute

    System.out.println(p1.getFileName()); // d
    System.out.println(p1.getRoot()); // null
    System.out.println(p1.getParent());  // a/b/c

    System.out.println(p2.getFileName());
    System.out.println(p2.getRoot());
    System.out.println(p2.getParent());

    System.out.println(p3.getFileName());
    System.out.println(p3.getRoot());
    System.out.println(p3.getParent());
  }
}
