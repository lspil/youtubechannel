package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {

  public static void main(String[] args) {
    try (
        var fis = new FileInputStream("cat1");
        var in = new ObjectInputStream(fis)
    ) {
      Cat c = (Cat) in.readObject();

      System.out.println(c);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
