package main;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Example4 {

    public static void main(String[] args) {
        // primitive stream
        // IntStream, LongStream, DoubleStream -> map(), mapToInt()

        // OptionalInt, OptionalLong, OptionalDouble

        // average(), min(), max(), reduce()

        OptionalDouble res1 =
            IntStream.of(3,4,5,6,7,8,9)
                .average(); // 2 3 ... 2.5



    }
}
