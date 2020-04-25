package main;

import java.util.Optional;
import java.util.stream.Collectors;

public class Example12 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        var n =
            o2.stream() // stream of one element
              .collect(Collectors.counting()); // only a stupid example

        var r = o2.filter(x -> x % 2 == 0)
                  .orElse(-1);

    }

    static Optional<Integer> twice(int x) {
        return Optional.of(2*x);
    }

}
