package example1;

import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdfg");

        // Stream
        // map(Function)  Stream -> Stream
        // mapToInt(ToIntFunction) Stream -> IntStream
        // mapToLong(ToLongFunction) Stream -> LongStream
        // mapToDouble(ToDoubleFunction) Stream -> DoubleStream

        // IntStream
        // map(ToIntFunction)  IntStream -> IntStream
        // mapToLong(IntToLongFunction) IntStream -> LongStream
        // mapToDouble(IntToDoubleFunction) IntStream -> DoubleStream
        // mapToObj(IntFunction) IntStream -> Stream

        // LongStream, DoubleStream

        var x = list.stream() // "abcd", "qwerty", "asdfg"
            .mapToInt(s -> s.length()) // 4, 6, 5   Stream  -> IntStream
            .mapToObj(s -> s)  // 4, 6, 5 IntStream -> Stream
            .mapToInt(s -> s)  // 4, 6, 5 Stream - IntStream
            .sum();

        System.out.println(x);
    }
}
