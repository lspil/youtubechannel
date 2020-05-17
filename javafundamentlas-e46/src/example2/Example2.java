package example2;

public class Example2 {

    public static void main(String[] args) {
        // 1
        // query DB1  -> 3 seconds
        // query DB2  -> 2 seconds
        // max(3 , 2) = 3  <  5

        // 2 --> join()
        // processing

        var db1 = new DB1Runnable();
        var db2 = new DB2Runnable();

        var t1 = new Thread(db1);
        var t2 = new Thread(db2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PROCESSING..."); // main
    }
}
