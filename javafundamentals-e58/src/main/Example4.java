package main;

import java.util.concurrent.*;

public class Example4 {

  public static void main(String[] args) {
    BlockingDeque<Integer> d1 = new LinkedBlockingDeque<>();

    BlockingQueue<Integer> q1 = new LinkedBlockingQueue<>();

    try {
      d1.offerFirst(4, 1, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
