package main;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

  public static void main(String[] args) throws Exception {
    ExecutorService service = Executors.newFixedThreadPool(100);

    MyTask t = new MyTask();

    service.submit(t);
    Thread.sleep(1000);
    service.submit(t);
    Thread.sleep(1000);
    service.submit(t);

    service.shutdown();
  }
}
