package main;

import java.util.Optional;

public class Example6 {

    public static void main(String[] args) {
        // java 8

        String s1 = null;

        int n1 = s1.length(); // :( NullPointerException
    }

    static Optional<String> m1() {
        // more complex code
        return Optional.empty();  // empty box
    }
}
