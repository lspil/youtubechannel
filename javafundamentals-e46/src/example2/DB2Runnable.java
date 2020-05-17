package example2;

public class DB2Runnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("DB 2 querying ended...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
