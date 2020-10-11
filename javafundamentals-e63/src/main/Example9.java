package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example9 {

  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("demo.txt");

    var res = Files.readAllLines(p1);

    res.forEach(System.out::println);
  }
}
