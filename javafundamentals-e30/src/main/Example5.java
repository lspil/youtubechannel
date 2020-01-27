package main;

public class Example5 {

    public static void main(String[] args) {
        R r1 = new R("A");
        R r2 = new R("B");

        try (r1;r2) { // works starting with Java 9 ---> OCP 11

        }

        //r1
    }
}
