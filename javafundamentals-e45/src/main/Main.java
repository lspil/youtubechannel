package main;

public class Main {

    // starting point of the main thread
    public static void main(String[] args) {
        EvenNumbersThread t1 = new EvenNumbersThread(); // NEW
        t1.start(); // you want your thread here to begin the execution // RUNNABLE

        System.out.println("END! " + Thread.currentThread().getName());

        // END! 0 2 4 6 8 ...  --> The most probable output
        // 0 END! 2 4 6 8 ...
        // ...
        // 0 2 4 6 8 10 END!
    }
}
