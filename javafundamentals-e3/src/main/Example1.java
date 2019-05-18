package main;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("X: ");
        int x = s.nextInt();
        System.out.print("Y: ");
        int y = s.nextInt();
        // ?:

        int result = x < y ? 50 : 100;

        System.out.println(result);
    }
}
