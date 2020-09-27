package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example5 {

  public static void main(String[] args) {
    try (
        var fis = new FileInputStream("c");
        var in = new ObjectInputStream(fis)
    ) {
      C c = (C) in.readObject(); // A

      System.out.println(c);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
