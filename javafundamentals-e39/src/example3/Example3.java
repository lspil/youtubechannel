package example3;

import java.util.List;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,6,3,8,9);

        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0); // true
        boolean b2 = list.stream().allMatch(x -> x % 2 == 0); // false
        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0); // false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Stream<Integer> s1 = Stream.iterate(1, i -> i + 1); // 1 2 3 4 5 6 ...
        Stream<Integer> s2 = Stream.iterate(1, i -> i + 2); // 1 3 5 7 9 11 ...

    }
}
