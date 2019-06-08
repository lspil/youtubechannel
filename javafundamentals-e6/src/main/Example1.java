package main;

public class Example1 {

    public static void main(String[] args) {
        // ++ --
        // i++; // i = i + 1;
        // i--; // i = i - 1;

        var i = 10;

        System.out.println(++i); // 11
        // 11

        System.out.println(i); // 11

        m(++i);
        m(i++);
    }

    static void m(int i) {

    }
}
