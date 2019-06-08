package main;

public class Example6 {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        x = x++ + ++x + --y + 2*x++; // 10 + 12 + 19 + 24

        System.out.println(x);
    }
}
