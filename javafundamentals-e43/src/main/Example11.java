package main;

import java.util.Optional;

public class Example11 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        o2.ifPresent(x -> { // Java 8
            System.out.println(x);
        });

        o2.ifPresentOrElse(x -> { // Java 9

        }, () -> {

        });
    }

    static Optional<Integer> twice(int x) {
        return Optional.of(2*x);
    }

}
