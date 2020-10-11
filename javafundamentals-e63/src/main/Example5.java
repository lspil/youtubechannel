package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example5 {

  public static void main(String[] args) throws IOException {
    Path p1 = Paths.get("demo.txt");

    Files.createFile(p1);
  }
}
