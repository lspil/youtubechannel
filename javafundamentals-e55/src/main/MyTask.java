package main;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyTask implements Runnable {

  private CyclicBarrier barrier;

  public MyTask() {
    barrier = new CyclicBarrier(99);
  }

  @Override
  public void run() {
    try {
      barrier.await(); // barrier blocks your threads
      System.out.println(":)");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
