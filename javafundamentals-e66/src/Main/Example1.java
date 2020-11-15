package Main;

import java.time.Instant;
import java.time.ZonedDateTime;

public class Example1 {

  public static void main(String[] args) {
    // Instant | Clock
    // Duration
    // Period

    Instant i1 = Instant.now();

    System.out.println(i1);

    ZonedDateTime z1 = ZonedDateTime.now();

    System.out.println(z1);

  }
}
