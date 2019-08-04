package main;

public class Example1 {

    public static void main(String[] args) {
        /**
         * Overloading
         * Overriding
         */

        A a = new A();


        a.a((String)null);

        B b1 = new B();
        B b2 = new B(10);
    }
}
