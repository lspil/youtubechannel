package main;

public class Example1 {

    public static void main(String[] args) {

        try (R r = new R("A")) { // try - with - resources
            // r
        } catch (Exception e) {
            //
        }
    }
}
