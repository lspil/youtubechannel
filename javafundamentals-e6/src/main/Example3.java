package main;

public class Example3 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        int z = x++ + ++y; // 10 + 21

        System.out.println(x); // 11
        System.out.println(y); // 21
        System.out.println(z); // 31
    }
}
