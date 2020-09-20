package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

  public static void main(String[] args) {
    try (var out =
             new BufferedWriter(
                 new FileWriter("test2.txt"))) {
      out.write("Hello world!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
