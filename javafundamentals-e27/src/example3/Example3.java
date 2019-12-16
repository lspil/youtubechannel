package example3;

import example1.Cat;

public class Example3 {

    public static void main(String[] args) {
        Card c1 = new Card("12345"); // z1
        Card c2 = new Card("12345"); // z2

        boolean r1 = c1 == c2; // false
        System.out.println(r1);

        System.out.println(c1.equals(c2)); // true
        // c2.equals(c1);
//        c1.equals(new int[]{3,4});
    }
}
