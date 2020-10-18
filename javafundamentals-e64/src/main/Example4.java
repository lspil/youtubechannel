package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example4 {

  public static void main(String[] args) {
    /**
     * lines()
     * list()
     * find()
     * walk()
     */
    try {
      Files.list(Path.of("."))
            .filter(p -> !p.toString().endsWith(".txt"))
            .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
