package main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Example1 {

    public static void main(String[] args) {
        ExecutorService service =
                Executors.newFixedThreadPool(4);

        Runnable r = () -> System.out.println(":)"); // ordering a pizza

        Future<?> f = service.submit(r); // order a pizza and get back a receipt

        // do a lot of stuff (buy a lot of things)

        try {
            f.get(); // get your pizza
            // if not ready -> then you have to wait
            // ready -> get() returns the value
        } catch (InterruptedException e) {

        } catch (ExecutionException e) {
            // pizza has been burnt
            // take a decision what you do
        }
        service.shutdown();
    }
}
