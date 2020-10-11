package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example6 {

  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("demo.txt");

//    Files.delete(p1);
    var res = Files.deleteIfExists(p1);

    System.out.println(res); // false
  }
}
