package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example8 {

  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("qwerty.txt");
    Path p2 = Paths.get("qwerty.txt");

    boolean res = Files.isSameFile(p1, p2);

    System.out.println(res);
  }
}
