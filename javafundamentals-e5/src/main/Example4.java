package main;

public class Example4 {

    public static void main(String[] args) {
        // &&   & --- AND

        // T  &&  T    T
        // F  &&  T    F
        // T  &&  F    F
        // F  &&  F    F

        boolean b1 = true;
        boolean b2 = true;

        boolean res = b1 & b2;

        System.out.println(res);
    }
}
