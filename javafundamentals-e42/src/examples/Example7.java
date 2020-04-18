package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        List<Integer> res =
            list.stream()
                    .collect(
                            Collectors.mapping(s -> s.length(), // string -> int
                                Collectors.toList())); // downstreaming

        System.out.println(res);
    }
}
