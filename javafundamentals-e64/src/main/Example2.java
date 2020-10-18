package main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example2 {

  private static String vowels = "aeiouAEIOU";

  public static void main(String[] args) {
    int n = 0;
    try (var in = Files.newBufferedReader(Paths.get("verse.txt"))) {
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
