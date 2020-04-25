package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

        double res1 =
            list.stream()
                .collect(Collectors.averagingInt(s -> s.length()));

        // averagingInt, averagingLong, averagingDouble

        System.out.println(res1);

    }
}
