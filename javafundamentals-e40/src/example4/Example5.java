package example4;

import java.util.Arrays;
import java.util.List;

public class Example5 {

    public static void main(String[] args) {
        List<String> list = List.of("ab4n3kdk4", "2n3n2nnm", "mko","102a");
        // 9 digits

        String digits = "0123456789";

        var res =
            list.stream() // "a4bn3kdk4", "2n3n2nnm", "mko","102a"
                .flatMap(s -> Arrays.stream(s.split("")))  // "a", "b", "4", "n", "3" ...
                .filter(s -> digits.contains(s)) // "4", "3"
                .count(); // long

        System.out.println(res);
    }
}
