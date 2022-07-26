package main;

public class Consumer implements Runnable {

  @Override
  public void run() {
    while (true) {
      synchronized (Main.container) {
        if (!Main.container.isEmpty()) {
          int x = Main.container.get(0);
          Main.container.remove(0);
          System.out.println("Consumer " + Thread.currentThread().getName() + " removed value " + x);
        }
      }
    }
  }
}
