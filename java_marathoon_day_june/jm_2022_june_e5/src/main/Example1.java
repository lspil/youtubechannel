package main;

import java.util.*;
import java.util.stream.Stream;

public class Example1 {

  public static void main(String[] args) {
    List<String> q1 = List.of("A","B","C");  // more confortable
    List<String> q2 = Arrays.asList("A", "B", "C");
    Set<String> s1 = Set.of("A", "B", "C");
    Map<String, Integer> m1 = Map.of("A", 1, "B", 2);

    Stream<String> str1 = Stream.of("A", "B", "C");
    Stream<String> str2 = Stream.empty();

    Optional<String> o1 = Optional.empty();
    Optional<String> o2 = Optional.of("A");

    // unit and integration tests
  }
}
