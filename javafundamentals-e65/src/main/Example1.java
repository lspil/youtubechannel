package main;

import java.time.LocalDate;
import java.time.LocalTime;

public class Example1 {

  public static void main(String[] args) {
    /**
     * LocalTime
     * LocalDate
     * LocalDateTime
     * ZonedDateTime
     *  ZoneId
     * Instant
     * Duration
     * Period
     */

    LocalTime t1 = LocalTime.now();
    System.out.println(t1);

    LocalTime t2 = LocalTime.of(14, 30);
    System.out.println(t2);

    LocalTime t3 = t1.minusHours(1); // plus / minus
    System.out.println(t3);

    LocalTime t4 = t1.withHour(16); // with
    System.out.println(t4);
  }
}
