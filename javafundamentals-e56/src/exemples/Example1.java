package exemples;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

  public static void main(String[] args) {
    CyclicBarrier c = new CyclicBarrier(3);

    Runnable r = () -> {
      try {
        c.await();
        System.out.println(":)");
      } catch (Exception e) {
        e.printStackTrace();
      }
    };

    ExecutorService service = Executors.newFixedThreadPool(3);

    service.submit(r);
    service.submit(r);
    service.submit(r);

    service.shutdown();
  }
}
