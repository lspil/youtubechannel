package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example2 {

    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            int n = Runtime.getRuntime().availableProcessors();
            service = // pool
                    Executors.newFixedThreadPool(n); // threads

            Runnable r = () -> System.out.println(":) " +
                    Thread.currentThread().getName()); // ball

            Future<?> f = service.submit(r); // throwing the ball into the pool

            System.out.println(":( " + Thread.currentThread().getName());
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
