package main;

public class Example1 {

    public static void main(String[] args) {

        /*
        primitives - numbers, characters, boolean (true / false)
        references - object
         */

        byte b1; // 8-bit  256 [-128, 127]
        b1 = 10;

        byte b2 = 10;

        short s1; // 16-bit
        int i1; //  32-bit
        long w1;

        w1 = 9999999999L;

        int z1,z2 = 50,z3;

        z1 = 045;
        System.out.println(z1);

        z3 = 0xFF; // A - F [0, F]
        System.out.println(z3);

        z2 = 0b101101010;
        System.out.println(z2);
    }
}
