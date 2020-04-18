package main;

import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {
        Stream<Cat> s = Stream.of(
                new Cat(3),
                new Cat(1),
                new Cat(5),
                new Cat(4),
                new Cat(2)
        );

        s.sorted()
         .forEach(c -> System.out.println(c.getAge()));
    }
}
