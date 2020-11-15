package Main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class Example3 {

  public static void main(String[] args) {

    // Period days, weeks, months...   P...
    // Duration nano, sec, min, hours  PT...

    Period p1 = Period.ofDays(10);
    Period p2 = Period.of(1, 5, 10);
    Period p3 = Period.between(
        LocalDate.of(2020, 10, 10),
        LocalDate.now()
        );

    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);

    Instant i1 = Instant.now();
    Instant i2 = Instant.now().minusSeconds(1000);

    Duration d1 = Duration.ofHours(10);
    Duration d2 = Duration.between(i2, i1);

    System.out.println(d1);
    System.out.println(d2);

  }
}
