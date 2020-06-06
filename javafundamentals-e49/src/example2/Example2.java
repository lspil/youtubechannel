package example2;

public class Example2 {

    public static void main(String[] args) {
        A a = new A();
        A b = new A();

        Thread t1 = new Thread() {
            public void run() {
                a.m1();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                a.m2();
            }
        };

        t1.start();
        t2.start();
    }
}
