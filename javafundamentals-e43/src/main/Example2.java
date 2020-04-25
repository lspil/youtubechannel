package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

        int res1 =
            list.stream()
                .collect(Collectors.mapping(s -> s.length(),
                            Collectors.summingInt(n -> n)));

        // summingInt, summingLong, summingDouble

        System.out.println(res1);

    }
}
