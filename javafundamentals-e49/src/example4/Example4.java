package example4;

public class Example4 {

    private Object a = new Object();
    private Object b = new Object();

    public void m1() {
        // T3
        synchronized (a) {
            // T1
            synchronized (b) {

            }
        }
    }

    public void m2() {
        // T4
        synchronized (a) {
            // T2
            synchronized (b) {

            }
        }
    }
}
