package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example3 {

  public static void main(String[] args) {
    try (FileOutputStream fos = new FileOutputStream("owner1");
         ObjectOutputStream out = new ObjectOutputStream(fos)) {

      var owner = new Owner("Bill", new Dog());

      out.writeObject(owner);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
