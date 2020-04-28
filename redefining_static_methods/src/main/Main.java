package main;

public class Main {

    public static void main(String[] args) {
        A.m();
        B.m();

        A a1 = null;
        a1.m();

        A b1 = new B();
        b1.m(); // A.m()  A

//        A a2 = null;
//        a1.q(); // NullPointerException

        A b2 = new A();
        b2.q(); // A

        A b3 = new B();
        b3.q(); // B
    }
}
