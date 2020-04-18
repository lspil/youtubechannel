package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example11 {

    public static void main(String[] args) {
        // collect() // Collector

        List<Integer> res =
            Stream.of(1,2,3,4,5,1,2) // [1,2,3,4,5]
                  .map(n -> 2*n) // [2,4,6,8,10,2,4]
                  .collect(Collectors.toList());

        System.out.println(res);
    }
}
