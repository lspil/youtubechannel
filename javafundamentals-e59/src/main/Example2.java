package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {


  public static void main(String[] args) {
    // System.in

    // InputStreamReader
    // FileReader

    InputStreamReader reader = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(reader);

    // IOException and FileNotFoundException
    try {
      String line = in.readLine();
      System.out.println("LINE: " + line);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
