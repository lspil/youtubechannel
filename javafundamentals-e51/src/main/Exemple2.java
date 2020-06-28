package main;

import java.util.concurrent.*;

public class Exemple2 {

    public static void main(String[] args) {
        ExecutorService service
                = Executors.newFixedThreadPool(4);

        Callable<String> c = () -> "Hello!";

        Future<String> f = service.submit(c);

        // do some stuff

        try {
            String value = f.get();
            System.out.println(value);
        } catch (InterruptedException | ExecutionException e) {
            // :(
        }
    }
}
