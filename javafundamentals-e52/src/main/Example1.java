package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example1 {

    public static void main(String[] args) {
        // Runtime.getRuntime().availableProcessors();
        ExecutorService es1 = Executors.newFixedThreadPool(4); // param is the no of threads

        ExecutorService es2 = Executors.newSingleThreadExecutor(); // equivalent to fixed thread pool with one thread

        ExecutorService es3 = Executors.newCachedThreadPool();

        ExecutorService es4 = Executors.newWorkStealingPool();
    }
}
