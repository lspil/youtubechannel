package main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example4 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService es1 = Executors.newSingleThreadScheduledExecutor();

        Runnable r1 = () -> System.out.println(":)");

        es1.scheduleWithFixedDelay(r1, 3, 5, TimeUnit.SECONDS);

        Thread.sleep(15000); // 15 seconds

        es1.shutdown();
    }
}
