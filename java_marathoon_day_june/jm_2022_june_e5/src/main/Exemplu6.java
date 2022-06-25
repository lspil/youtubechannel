package main;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class Exemplu6 {

  public static void main(String[] args) {

    Stream<Integer> s1 = Stream.of(1,2,3,4,5);
    int sum1 = s1.reduce(0, (x,y) -> x + y);

    Stream<Integer> s2 = Stream.of(1,2,3,4,5);
    int sum2 = s2.mapToInt(x -> x).sum(); // is only for a primitive stream, int, long, double

    Optional<Integer> o1 = Optional.empty(); // this should be used instead of null
    Optional<Integer> o2 = Optional.of(5); // mandatory the param is not null

    Integer x = null; // something that might be null;
    Optional<Integer> o3 = Optional.ofNullable(x); // creates and empty box if x is null or a box containing x in case it's not null;
    // same as
    Optional<Integer> o4;
    if (x == null) {
      o4 = Optional.empty();
    } else {
      o4 = Optional.of(x);
    }
  }
}
