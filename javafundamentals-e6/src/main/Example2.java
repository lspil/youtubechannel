package main;

public class Example2 {

    public static void main(String[] args) {
        // ++ --

        int x = 10;
        int y = 20;

        //int z = x++ + 5; // 10 + 5
        int z = ++x + 5; // 11 + 5

        System.out.println(x); // 11
        System.out.println(y); // 20
        System.out.println(z); // 16
    }
}
