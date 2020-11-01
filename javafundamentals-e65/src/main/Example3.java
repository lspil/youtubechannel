package main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Example3 {

  public static void main(String[] args) {
//    ZoneId.getAvailableZoneIds().forEach(System.out::println);

    ZonedDateTime d1 =
        ZonedDateTime.of(
            LocalDateTime.of(2020, 10, 25, 1, 0, 0),
            ZoneId.systemDefault());

    System.out.println(d1);
    d1 = d1.plusHours(3);
    System.out.println(d1);
  }
}
