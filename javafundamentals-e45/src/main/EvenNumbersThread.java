package main;

public class EvenNumbersThread extends Thread {

    @Override
    public void run() { // main method of a thread
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i + " " + Thread.currentThread().getName());
                Thread.sleep(1000); // InterruptedException
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } // DEAD
}
