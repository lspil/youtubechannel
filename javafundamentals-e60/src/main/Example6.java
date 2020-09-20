package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example6 {

  public static void main(String[] args) {
    /**
     * ObjectOutputStream
     * ObjectInputStream
     *
     * Serializable
     */

    try (ObjectOutputStream out =
             new ObjectOutputStream(new FileOutputStream("cat1"))) {
      Cat c = new Cat("Tom");
      out.writeObject(c);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
