package example3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {

    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(1,2,3,4,5,6);

        var list = s.toList();

//        var list = s.collect(Collectors.toList());

        System.out.println(list);
    }
}
