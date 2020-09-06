package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Example5 {

  public static void main(String[] args) {
    Map<Integer, Integer> m1 = new HashMap<>();

    Map<Integer, Integer> sm1 = Collections.synchronizedMap(m1);


    ConcurrentHashMap<Integer, Integer> m2 = new ConcurrentHashMap<>();
  }
}
