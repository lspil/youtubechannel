package example1;

public class Example1 {
    private Object monitor = new Object();

    public void a() {
        synchronized (monitor) {

        }
    }

    public void b() {
        // here
        synchronized (this) {

        }
        // here
    }

    public synchronized /* this */ void c() {

    }

    public static synchronized void d() {

    }

    public static void e() {
        synchronized (Example1.class) {

        }
    }
}
