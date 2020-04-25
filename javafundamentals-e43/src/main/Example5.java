package main;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "BB", "C", "DDDDDD", "E");

        IntSummaryStatistics res1 =
            list.stream()
                .mapToInt(s -> s.length())
                .summaryStatistics();

        System.out.println(res1);

        IntSummaryStatistics res2 =
            list.stream()
                    .collect(Collectors.summarizingInt(s -> s.length()));

        System.out.println(res2);
    }
}
