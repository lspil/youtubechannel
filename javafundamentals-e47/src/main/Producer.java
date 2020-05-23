package main;

import java.util.Random;

public class Producer extends Thread {

    public Producer(String name) {
        super(name);
    }

    @Override
    public void run() {
        Random r = new Random();
        // 100  wait() notify()

        // scja / scjp -> oca8 / ocp8 -> ocp I 11 / ocp II 11
        while (true) {
            synchronized (Main.bucket) {
                if (Main.bucket.size() < 100) {  // T1
                    int n = r.nextInt(1000); // [0,999]
                    Main.bucket.add(n);
                    System.out.println(Thread.currentThread().getName()
                            + " added value " + n + " to the bucket");
                }
            }
        }
    }
}
