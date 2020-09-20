package main;

import java.io.*;

public class Example3 {

  public static void main(String[] args) {
    // Reader ---> InputStreamReader / FileReader

    try {
      BufferedReader in = new BufferedReader(
          new InputStreamReader(
              new FileInputStream("test2.txt")
          )
      );

      String line;

      while ( (line = in.readLine()) != null ) {
        System.out.println(line);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
