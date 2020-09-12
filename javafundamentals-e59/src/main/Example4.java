package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example4 {


  public static void main(String[] args) {
    var in = new BufferedReader(new InputStreamReader(System.in));

    try (in) {   // OCP 11
      String line = in.readLine();
      System.out.println("LINE: " + line);
    } catch (IOException e) {
      e.printStackTrace();
    }

    // using the stream here would mean to use a closed stream
  }
}
