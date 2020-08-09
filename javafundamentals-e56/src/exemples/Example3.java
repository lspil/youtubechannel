package exemples;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example3 {

  public static void main(String[] args) {
    CountDownLatch c = new CountDownLatch(3);

    Runnable r = () -> {
      try {
        c.await();
        System.out.println(":)");
      } catch (Exception e) {
        e.printStackTrace();
      }
    };

    Runnable q = () -> {
      try {
        Thread.sleep(2000);
        c.countDown();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    };

    ExecutorService service = Executors.newFixedThreadPool(4);

    service.submit(r);
    service.submit(r);
    service.submit(r);

    service.submit(q);
    service.submit(q);
    service.submit(q);

    service.shutdown();
  }
}
