package main;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.function.Supplier;

public class Example10 {

    public static void main(String[] args) {
        Optional<Integer> o1 = Optional.empty(); // empty box
        Optional<Integer> o2 = Optional.of(10); // 10 is inside the box here

        // map()   x -> y
        // flatMap() x -> Optional(y)

        var res1 = o2.map(x -> 2*x).orElse(-1);
        System.out.println(res1); // 20

        var res2 = o2.flatMap(x -> twice(x)).orElse(-1);
        System.out.println(res2); // 20
    }

    static Optional<Integer> twice(int x) {
        return Optional.of(2*x);
    }

}
