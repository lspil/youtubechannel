package main;

import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,2,7,9,8,2,1,5,4);
        // distinct()
        // sorted() / sorted(Comparator)
        list.stream()
            .distinct()
            .sorted() // Comparable
            .forEach(System.out::println);
    }
}
