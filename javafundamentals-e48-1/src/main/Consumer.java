package main;

public class Consumer extends Thread {

    public Consumer(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            while (true) {
                // not sync
                // Tx
                synchronized (Main.bucket) {
                    if (!Main.bucket.isEmpty()) {
                        int n = Main.bucket.get(0);
                        Main.bucket.remove(0);
                        Main.bucket.notifyAll();
                        System.out.println(Thread.currentThread().getName()
                                + " took out the value " + n + " from the bucket");
                    } else {
                        Main.bucket.wait();
                    }
                }

                // not sync
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
