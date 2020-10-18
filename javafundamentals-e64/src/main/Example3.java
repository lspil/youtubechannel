package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Example3 {

  private static String vowels = "aeiouAEIOU";

  public static void main(String[] args) {
    try {
      var res =
        Files.lines(Paths.get("verse.txt"))
               .flatMap(line -> Arrays.stream(line.split("")))
               .filter(c -> vowels.contains(c))
               .count();
      System.out.println(res);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
