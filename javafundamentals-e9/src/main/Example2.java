package main;

public class Example2 {

    public static void main(String[] args) {
        int [] x;
        x = new int[5];

        int [] y1 = {}; // length 0
        int [] y2 = {2,8,7,9,4}; // length 5

        int [] w1;
        w1 = new int[] {2, 8, 7}; // length 3

        var q1 = new int[10];
        //var q2 = {1,2,3}; NOT POSSIBLE
        var q3 = new int[] {1,2,3,4}; // length 4

        m(new int[5]);
        //m({1,2,3,4,5}); NOT POSSIBLE
        m(new int[] {1,2,3,4});
    }

    private static void m(int [] z) {

    }


}
