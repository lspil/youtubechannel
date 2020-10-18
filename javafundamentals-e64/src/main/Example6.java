package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Example6 {

  public static void main(String[] args) {
    /**
     * lines()
     * list()
     * find()
     * walk()
     */
    try {
      Files.find(Path.of("."), 3, (p,a) -> a.size() < 100)
            .forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
