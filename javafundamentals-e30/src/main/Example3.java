package main;

public class Example3 {

    public static void main(String[] args) {
        try (R r1 = new R("R")) {

        } finally {
            System.out.println(":(");
        }
    }
}
