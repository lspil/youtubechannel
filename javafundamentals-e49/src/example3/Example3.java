package example3;

public class Example3 {

    private Object a = new Object();
    private Object b = new Object();

    public void m1() {
        // T3
        synchronized (a) {
            // T1
            synchronized (b) {  // DEADLOCK

            }
        }
    }

    public void m2() {
        // T4
        synchronized (b) {
            // T2
            synchronized (a) {  // DEADLOCK

            }
        }
    }
}
