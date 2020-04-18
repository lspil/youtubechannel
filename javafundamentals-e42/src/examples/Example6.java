package examples;

import java.util.List;
import java.util.stream.Collectors;

public class Example6 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA","B","CCCCC","DDD", "FFFFFF", "AAA");

        var res =
            list.stream()
                    .collect(Collectors.teeing(
                            Collectors.counting(), // Long
                            Collectors.joining(), // String
                            (a,b) -> List.of(a,b)
                    ));

        System.out.println(res);
    }
}
