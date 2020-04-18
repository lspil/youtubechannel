package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example2 {

    public static void main(String[] args) {
        List<Integer> list = List.of(3,5,2,7,9,8,2,1,5,4);
        // distinct()
        // sorted() / sorted(Comparator)
        Comparator<Integer> c = Collections.reverseOrder();
        list.stream()
            .distinct()
            .sorted(c)
            .forEach(System.out::println);
    }
}
