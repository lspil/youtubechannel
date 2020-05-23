package main;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            // not sync
            // Tx
            synchronized (Main.bucket) {
                if (!Main.bucket.isEmpty()) {
                    int n = Main.bucket.get(0);
                    Main.bucket.remove(0);
                    System.out.println(Thread.currentThread().getName()
                            + " took out the value " + n + " from the bucket");
                }
            }

            // not sync
        }
    }
}
