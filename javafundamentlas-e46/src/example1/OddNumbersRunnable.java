package example1;

public class OddNumbersRunnable implements Runnable {

    @Override
    public void run() {
        for (int i=1; i<=11; i+=2) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}
