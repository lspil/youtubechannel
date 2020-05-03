package main;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Example2 {

    public static void main(String[] args) {
        // Comparable and Comparator
        // min()
        // max()

        List<Integer> list1 = List.of(3,1,5,7,2,5,7);

        Comparator<Integer> c = (x,y) -> x - y; // int - 0 +
        Optional<Integer> o1 =
            list1.stream()
                .min(c);

        o1.ifPresent(System.out::println); // x -> System.out.println(x);

        List<Integer> list2 = List.of(3,1,5,7,2,5,7);

        Optional<Integer> o2 =
                list2.stream()
                        .max((x,y) -> x - y);

        o2.ifPresent(System.out::println);

        Optional<Integer> o3 =
            List.of(1,5,9,7,3)
                .stream() // 1,5,9,7,3
                .filter(x -> x % 2 == 0) // []
                .max((x,y) -> x - y);
        System.out.println(o3.isPresent()); // false
    }
}
