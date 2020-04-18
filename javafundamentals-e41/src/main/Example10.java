package main;

import java.util.List;

public class Example10 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,50,70,100,130);

        list.stream()
            .dropWhile(n -> n <= 100) // [130]
            .forEach(System.out::println);
    }
}
