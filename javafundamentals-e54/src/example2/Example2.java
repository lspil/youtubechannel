package example2;

import java.util.concurrent.Semaphore;

public class Example2 {

  private Semaphore semaphore = new Semaphore(4, true);

  public static void main(String[] args) {
    // Sempahore  -> synchronizations
  }

  public void m() {
    try {
      semaphore.acquire();
      // something happens here
    } catch (InterruptedException e) {

    } finally {
      semaphore.release();
    }
  }

  public void n() {
    //  T3
    synchronized (this) {

    }
  }
}
