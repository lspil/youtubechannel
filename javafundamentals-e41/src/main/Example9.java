package main;

import java.util.List;

public class Example9 {

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,50,70,100,130);

        list.stream()
            .takeWhile(n -> n <= 100) // while(condition)
            .forEach(System.out::println);
    }
}
