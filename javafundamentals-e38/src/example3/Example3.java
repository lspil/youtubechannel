package example3;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Example3 {

    public static void main(String[] args) {
//        List<Integer> list = List.of(10,20,30,40);
//
//        Consumer<Integer> c = x -> System.out.println(x);
//        list.forEach(c);

        Map<Integer, String> map = Map.of(
                10, "A",
                20, "B",
                30, "C"
        );

        BiConsumer<Integer, String> c2 = (k, v) -> System.out.println(k + " " +v);
        map.forEach(c2);
    }
}
