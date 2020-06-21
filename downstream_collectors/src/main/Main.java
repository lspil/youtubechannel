package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> list =
                Arrays.asList("AAA", "A", "AAAAA","AAA", "A", "AAAA");

        /*
        3 ["AAA", "AAA"]
        1 ["A", "A"]
        5 ["AAAAA"]
        4 ["AAAA"]
         */

        // g(x) -> y (grouping by)
        // f(x) ^ g(x) -> f(g(x)) -> y

        /*
        3 "AAA-AAA"
        1 "A-A"
        5 "AAAAA"
        4 "AAAA"
         */

        Map<Integer, String> res =
            list.stream()
                    .collect(
                            Collectors.groupingBy(s -> s.length(),
                                    Collectors.joining("-")));

        System.out.println(res);
    }
}
