package main;

import java.util.Random;

public class Producer implements Runnable {

  @Override
  public void run() { // main method of a thread - defining the logic executed concurrently on a separate thread
    Random r = new Random(); // SecureRandom the best to use here
    while (true) { // here is possible that both consumer & producer are active
      synchronized (Main.container) {
        if (Main.container.size() < 100) {
          int x = r.nextInt();
          Main.container.add(x);
          System.out.println("Producer " + Thread.currentThread().getName() + " added value " + x);
        }
      }
    }
  }
}
