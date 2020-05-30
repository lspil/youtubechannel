package main;

public class IncrementingThread extends Thread {

    @Override
    public void run() {
        try {
            while (true) {
                Main.c++;
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
