package exemples;

import java.util.concurrent.Semaphore;

public class Example4 {

  static Semaphore s = new Semaphore(1);

  public static void main(String[] args) {
    demo();
  }

  static void demo() {
    try {
      s.acquire();
      System.out.println(":)");
      demo();
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      s.release();
    }
  }
}
