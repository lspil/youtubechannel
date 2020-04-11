package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

    public static void main(String[] args) {
        // skip()
        // peek()
        // takeWhile() // java 9 -> OCP 11
        // dropWhile() // java 9 -> OCP 11

        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> output = new ArrayList<>(); // [2,4,6,8,10]
//        input.stream() // [1,2,3,4,5,6,7,8,9,10]
//             .filter(n -> n % 2 == 0) // [2,4,6,8,10]
//             .peek(n -> output.add(n))   // not recommended
//             .forEach(System.out::println); // collect()  / Collectors

        List<Integer> output =
                input.stream()
                     .filter(n -> n % 2 == 0) // [2,4,6,8,10]
                     .collect(Collectors.toList());

        System.out.println(output); // [2,4,6,8,10]
    }
}
