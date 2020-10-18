package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Example1 {

  private static String vowels = "aeiouAEIOU";

  public static void main(String[] args) {
    int n = 0;
    try (
        FileInputStream fis = new FileInputStream("verse.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(fis)
    )) {
      String line;

      while ((line = in.readLine()) != null) {
        for (int i = 0; i<line.length(); i++) {
          if(vowels.contains(String.valueOf(line.charAt(i)))) {
            n++;
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(n);
  }
}
