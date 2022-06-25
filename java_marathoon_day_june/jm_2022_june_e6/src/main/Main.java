package main;

import java.util.ArrayList;
import java.util.List;

// producer - consumer multithreaded architecture
public class Main {

  public static List<Integer> container = new ArrayList<>(); // non-concurrent collection

  public static void main(String [] args) {
    Thread t1 = new Thread(new Producer());
    t1.setName("_P1");
    t1.start();

    Thread t2 = new Thread(new Consumer());
    t2.setName("_C1");
    t2.start();
  }
}
