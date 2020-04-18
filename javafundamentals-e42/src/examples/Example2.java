package examples;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example2 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF");

        Map<String, Integer> map1 =
                list.stream()
                .collect(
                        Collectors.toMap(
                        s -> s,
                        s -> s.length())
                );

        System.out.println(map1);
    }
}
