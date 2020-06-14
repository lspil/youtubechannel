package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

    public static void main(String[] args) {
        // Executor <- ExecutorService

        ExecutorService service = null;
        try {
            int n = Runtime.getRuntime().availableProcessors();
            service = // pool
                    Executors.newFixedThreadPool(n); // threads

            Runnable r = () -> System.out.println(":) " +
                    Thread.currentThread().getName()); // ball

            service.execute(r); // throwing the ball into the pool

            System.out.println(":( " + Thread.currentThread().getName());
        } finally {
            if (service != null) {
                service.shutdown();
//                service.shutdownNow();
            }
        }

    }
}
