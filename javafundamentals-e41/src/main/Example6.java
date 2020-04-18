package main;

import java.util.List;

public class Example6 {

    public static void main(String[] args) {
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        list.stream() // [1,2,3,4,5,6,7,8,9,10]
            .peek(n -> System.out.println(n))  // [1,2,3,4,5,6,7,8,9,10]
            .filter(n -> n % 2 == 0)  //  [2,4,6,8,10]
            .forEach(System.out::println); // [2,4,6,8,10]
    }
}
