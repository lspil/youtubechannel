package main;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example3 {

  public static void main(String[] args) {
    Path p1 = Paths.get("a/b/c/./././d/../../c");  // ./  ../

    /**
     * a/b/c/./././d/../../c    ---->    a/b/c
     */

    System.out.println(p1.normalize());

    Path p2 = Paths.get("a/../../../b"); // relative

    /*
    *  ../../b
     */
    System.out.println(p2.normalize());

    Path p3 = Paths.get("/a/../../../b"); // absolute /b

    System.out.println(p3.normalize());
  }
}
