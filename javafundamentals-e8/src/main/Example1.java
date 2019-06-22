package main;

public class Example1 {

    public static void main(String[] args) {
        final int x;

        x = 10;
    }

    void m(final int x) {
        // here
        // x = 10;
        // value 10
    }
}
