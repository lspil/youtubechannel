package main;

public class Example2 {

    public static void main(String[] args) {
        // float
        // double

        double d1 = 10.5;
        float f1 = 10.5F;
        float f2 = (float) 10.5;

        d1 = f1;
        f1 = (float) d1;

        int i1 = (int) d1;
        System.out.println(i1); // 10
    }
}
