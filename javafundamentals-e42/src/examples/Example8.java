package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example8 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        List<Integer> res1 =
            list.stream()
                .collect(Collectors.mapping(s -> s.length(),
                           Collectors.filtering(n -> n % 2 == 0,
                             Collectors.toList())));

        System.out.println(res1);

        List<Integer> res2 =
                list.stream()
                    .map(s -> s.length())
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());

        System.out.println(res2);
    }
}
