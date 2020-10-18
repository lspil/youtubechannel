package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example5 {

  public static void main(String[] args) {
    /**
     * lines()
     * list()
     * find()
     * walk()
     */
    try {
      Files.walk(Path.of("."), 3)
            .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
