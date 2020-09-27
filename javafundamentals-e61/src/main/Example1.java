package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1 {

  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("cat1");
         ObjectOutputStream out = new ObjectOutputStream(fos)) {

      var cat = new Cat("Tom", 5);

      out.writeObject(cat);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
