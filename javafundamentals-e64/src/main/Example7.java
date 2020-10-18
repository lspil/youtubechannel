package main;

import java.io.File;
import java.io.IOException;

public class Example7 {

  public static void main(String[] args) {
    File f = new File("test"); // legacy
    try {
      f.createNewFile();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
