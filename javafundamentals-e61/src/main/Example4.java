package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example4 {

  public static void main(String[] args) {
    C c = new C(); // A B C

    try (FileOutputStream fos = new FileOutputStream("c");
         ObjectOutputStream out = new ObjectOutputStream(fos)) {

      out.writeObject(c);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
