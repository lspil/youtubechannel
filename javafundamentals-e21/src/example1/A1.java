package example1;

public class A1 { // outer

    private int x; // this
    private static int y;

    class A2 { // inner

        void m() {
            A1.this.x = 10; // A1.this / A1.super
        }
    }

    static class A3 {
        // A1.this is not accessible here!

        void m() {
            A1.y = 10;
        }
    }
}
