package main;

public class Example5 {

    public static void main(String[] args) {
        try {
            int x = m();
            System.out.println(x); // 1
        } catch (ArithmeticException e) {
            System.out.println(":)");
        }
    }

    public static int m() {
        int x = 1/1; // ArithmeticException
        return x;
    }
}
