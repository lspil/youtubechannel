package main;

import java.util.Optional;
import java.util.function.Supplier;

public class Example9 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        Integer i1 = o1.orElse(-1); // -1
        Integer i2 = o2.orElse(-1); // 10

        Supplier<Integer> s1 = () -> -1;
        Integer i3 = o1.orElseGet(s1);

        Integer i4 = o2.orElseThrow(() -> new RuntimeException()); // 10

        Integer i5 = o1.or(() -> o2).orElse(-1); // 10  Java 9

        o1.ifPresentOrElse(x -> {
            System.out.println(x);
        }, () -> {
            System.out.println("There's no value!");
        });
    }

    static Integer m() {
        return null;
    }

}
