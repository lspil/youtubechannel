package main;

import java.util.List;
import java.util.stream.Collectors;

public class Example4 {

  public static void main(String[] args) {
    List<String> list = List.of("A", "B", "CC", "DDD"); // create a new list of only the strings with odd length

    List<String> result = list.stream()
        .filter(s -> s.length() % 2 == 1)
        .collect(Collectors.toList()); // GOOD!

    result.stream()
        .forEach(s -> System.out.println(s));

  }
}