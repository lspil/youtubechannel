package examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example3 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        Map<String, Integer> map1 =
                list.stream()
                .collect(
                        Collectors.toMap(
                         s -> s,
                         s -> s.length(),
                         (a,b) -> a + b
                        )
                );

        System.out.println(map1);
    }
}
