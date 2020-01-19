package main;

public class Example1 {
    // a() -> b() -> c()
    public static void main(String[] args) {
        // try - catch - finally
        try {
            int x = m();
            System.out.println(x);
        } finally {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/1; // ArithmeticException
        return x;
    }
}
