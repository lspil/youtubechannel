package main;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example4 {

    public static void main(String[] args) {
        Stream<Dog> s = Stream.of(
                new Dog(3),
                new Dog(1),
                new Dog(5),
                new Dog(4),
                new Dog(2)
        );

        Comparator<Dog> comp = (d1,d2) -> d2.getAge() - d1.getAge();
        s.sorted(comp)
         .forEach(c -> System.out.println(c.getAge()));
    }
}
