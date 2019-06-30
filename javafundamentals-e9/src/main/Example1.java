package main;

public class Example1 {
    public static void main(String[] args) {
        /**
         * int [] x;
         * x = new int[5];
         *
         * |8|9|7|1|2|
         *  0 1 2 3 4
         *
         *  lastIndex = x.length - 1;
         */

        int [] x = new int[5];

        // ===> ArrayIndexOutOfBoundsException
        x[0] = 8;
        x[1] = 9;
        x[2] = 7;
        x[3] = 1;
        x[4] = 2;

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]); // 0 .. 4
        }

    }
}
