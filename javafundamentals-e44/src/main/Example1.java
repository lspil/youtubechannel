package main;


import java.util.Optional;
import java.util.stream.Stream;

public class Example1 {

    public static void main(String[] args) {
        // findFirst(); // terminal
        // findAny();
        // Optional

        Stream<Integer> s1 = Stream.empty(); // empty
        Stream<Integer> s2 = Stream.of(10,20,50,30);

        var o1 = s1.findFirst();

        System.out.println(o1.isPresent()); // false

        Optional<Integer> o2 = s2.findFirst();

        System.out.println(o2.isPresent()); // true

        int x = o2.get();
        System.out.println(x);
    }
}
