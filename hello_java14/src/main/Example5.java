package main;

public class Example5 {

    public static void main(String[] args) {
//        m1().m2().m3(); // NullPointerException
        int [][] x = new int[3][];

        x[0][0] = 10;
    }

    static Example5 m1() {
        return new Example5(); // not null
    }

    Example5 m2() {
        return null; // null
    }

    void m3() {
        System.out.println(":)");
    }
}
