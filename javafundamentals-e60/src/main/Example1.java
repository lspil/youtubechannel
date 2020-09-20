package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Example1 {

  public static void main(String[] args) {
    /**
     * FileOutputStream
     * FileInputStream
     *
     * BufferedWriter    --->  Writer
     * BufferedReader    --->  Reader
     *
     * PrintStream   ---> System.out / System.err
     * PrintWriter
     *
     */

    try (Writer w = new FileWriter("test1.txt");
         BufferedWriter out = new BufferedWriter(w)) {
      out.write("Hello world!");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
