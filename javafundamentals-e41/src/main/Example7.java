package main;

import java.util.ArrayList;
import java.util.List;

public class Example7 {

    public static void main(String[] args) {
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        List<Integer> input = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> output = new ArrayList<>(); // [2,4,6,8,10]
        input.stream() // [1,2,3,4,5,6,7,8,9,10]
             .filter(n -> n % 2 == 0) // [2,4,6,8,10]
             .peek(n -> output.add(n))   // not recommended
             .forEach(System.out::println); // collect()  / Collectors

        System.out.println(output); // [2,4,6,8,10]
    }
}
