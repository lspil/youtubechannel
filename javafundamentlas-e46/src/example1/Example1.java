package example1;

public class Example1 {

    public static void main(String[] args) {
        var r1 = new OddNumbersRunnable();

        var t1 = new Thread(r1, "T1"); // NEW
        var t2 = new Thread(r1, "T2"); // NEW

        t1.start();  // NEW -> RUNNABLE
        t2.start();

        System.out.println("END " +Thread.currentThread().getName());
    }
}
