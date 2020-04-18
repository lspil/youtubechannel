package examples;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example10 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        Map<Integer, List<String>> map1 =
        list.stream()
            .collect(
               Collectors.groupingBy(s -> s.length()));

        System.out.println(map1);
        // 3 -> ["AAA", "DDD", "AAA"]
        // 1 -> ["B"]
        // 5 -> ["CCCCC"]
        // 6 -> ["FFFFFF"]

        Map<Integer, String> map2 =
                list.stream()
                    .collect(
                       Collectors.groupingBy(s -> s.length(),
                         Collectors.mapping(s -> String.valueOf(s.length()),
                           Collectors.joining())));

        System.out.println(map2);
    }
}
