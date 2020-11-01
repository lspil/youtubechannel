package main;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Example4 {

  public static void main(String[] args) {
    // java.util.Date (legacy)
    // java.util.Calendar (legacy)

    ZonedDateTime zdt = ZonedDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm:ss dd:MM:YYYY");

    String res = df.format(zdt);

    System.out.println(res);
  }
}
