package example1;

public class Example1 {

    public static void main(String[] args) {
        int x = 10; // reserved in the stack
        m1();
    }

    static void m1() {
        int y = 10;
        m2();
    }

    static void m2() {
        m3();
        m4();
    }

    static void m3() {
        //new RuntimeException().printStackTrace();
    }

    static void m4() {

    }
}
