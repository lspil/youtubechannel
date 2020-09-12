package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example3 {


  public static void main(String[] args) {
    // IOException and FileNotFoundException
    try (var in = new BufferedReader(new InputStreamReader(System.in))) {
      String line = in.readLine();
      System.out.println("LINE: " + line);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
