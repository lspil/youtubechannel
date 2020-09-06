package main;

import java.util.NavigableSet;
import java.util.concurrent.*;

public class Example1 {

  public static void main(String[] args) {
    ConcurrentMap<Integer, String> m1
            = new ConcurrentHashMap<>(); // HashMap / not sorted

    ConcurrentMap<Integer, String> m2
            = new ConcurrentSkipListMap<>(); // eq with TreeMap / sorted

    ConcurrentNavigableMap<Integer, String> m3
            = new ConcurrentSkipListMap<>(); // eq with TreeMap / sorted

    NavigableSet<Integer> s1 =
            new ConcurrentSkipListSet<>(); // TreeSet / sorted
  }
}
