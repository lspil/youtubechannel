package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

        int res1 =
            list.stream() // ["AAA", "BB", "C", "DDDDDD", "E"]
                .mapToInt(s -> s.length())    // [3,2,1,6,1]
                .sum();
        System.out.println(res1);

        int res2 =
            list.stream()
                .collect(Collectors.summingInt(s -> s.length()));


        System.out.println(res2);

        long res3 =
            list.stream()
               .collect(Collectors.summingLong(s -> (long) s.length()));


        System.out.println(res3);
    }
}
