package examples;

import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        String res1 =
                list.stream()
                 .collect(Collectors.joining());

        System.out.println(res1);

        String res2 =
                list.stream()
                        .collect(Collectors.joining(","));

        System.out.println(res2);

        String res3 =
                list.stream()
                        .collect(Collectors.joining(",", "[", "]"));

        System.out.println(res3);
    }
}
