package exemples;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2 {

  public static void main(String[] args) {
    CountDownLatch c = new CountDownLatch(3);

    Runnable r = () -> {
      try {
        c.countDown();
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
