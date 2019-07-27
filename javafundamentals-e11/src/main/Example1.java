package main;

public class Example1 {

    public static void main(String[] args) {
        m1(1,2,3);
        m2("ABC", 2 ,5 ,6);

        // ...

        int [] a = {1,2,3,4,5};
        m1(a); // m1(1,2,3,4,5);

        // ...
        int [] b1 = {1,2,3,4,5,6};
        int [] b2 = {1,2,3,4,5,6};

        int [][] c = {b1,b2};
        m3(c); // m3(b1,b2);
    }

    static void m1(int... a) { // array with one dim -> vector
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void m2(String x, int... y) {
        System.out.println(x);
        System.out.println(y.length);
    }

    static void m3(int[]... x) { // array of arrays -> matrix
        for (int[] a: x) {
            for (int b: a) {
                //
            }
        }
    }
}
