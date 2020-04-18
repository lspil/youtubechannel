package main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example12 {

    public static void main(String[] args) {
        // collect() // Collector

        Set<Integer> res =
            Stream.of(1,2,3,4,5,1,2) // [1,2,3,4,5]
                  .map(n -> 2*n) // [2,4,6,8,10,2,4]
                  .collect(Collectors.toSet()); // [2,4,6,8,10]

        System.out.println(res); // [2,4,6,8,10]
    }
}
