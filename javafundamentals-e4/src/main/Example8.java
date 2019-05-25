package main;

public class Example8 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            i = i + 1;
            if (i % 2 == 0) { // 2 4 6 ...
                continue;
            }
            System.out.println(i);
        }

    }
}
