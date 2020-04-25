package main;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

        long res1 =
            list.stream()
                .mapToInt(s -> s.length())
                .count();

        long res2 =
                list.stream()
                        .mapToInt(s -> s.length())
                        .sum();

        var res3 =
                list.stream()
                        .mapToInt(s -> s.length())
                        .average();

        IntSummaryStatistics res4 =
            list.stream()
                .mapToInt(s -> s.length())
                .summaryStatistics();

        System.out.println(res4);

    }
}
