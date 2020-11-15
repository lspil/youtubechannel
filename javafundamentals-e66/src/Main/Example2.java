package Main;

import java.time.Clock;
import java.time.Instant;

public class Example2 {

  public static void main(String[] args) {
    Clock c = Clock.systemUTC();

    Instant i = Instant.now(c);

    System.out.println(i);
  }
}
