package main;

public class Example6 {

    public static void main(String[] args) {
        R r1 = new R("A");
        m(r1);

        // here the resource r1 is closed !!!!!
    }

    public static void m(R r) {
        try (r) {

        }
    }
}
