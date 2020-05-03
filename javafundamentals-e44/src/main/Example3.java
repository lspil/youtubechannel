package main;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {
        List<Integer> list1 = List.of();
        Stream<Integer> s1 = Stream.of(3,4,5,6,7,8);

        int res1 =
            list1.stream() // there're no elements -> 0
                 .reduce(0, (x,y) -> x + y);

        Optional<Integer> res2 =
            list1.stream()
                  .reduce((x,y) -> x + y);


        System.out.println(res1); // 0
        System.out.println(res2.isPresent()); // false
    }
}
