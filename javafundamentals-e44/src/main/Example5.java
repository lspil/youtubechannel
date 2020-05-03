package main;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {
        List<Integer> list = List.of();

        Optional<Integer> res1 =
            list.stream()
                .collect(Collectors.minBy((x,y) -> x-y));

        Optional<Integer> res2 =
            list.stream()
                .collect(Collectors.maxBy((x,y) -> x-y)); // 3 < 5  3 - 5 --> negative

        Optional<Integer> res3 =
                list.stream()
                        .collect(Collectors.minBy((x,y) -> y-x)); // max

        Optional<Integer> res4 =
                list.stream()
                        .collect(Collectors.reducing((a,b) -> a + b));
    }
}
