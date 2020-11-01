package main;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Example2 {

  public static void main(String[] args) {
    LocalDate d1 = LocalDate.now();
    LocalDate d2 = LocalDate.of(2020, 10,30);

    System.out.println(d1);
    System.out.println(d2);

    LocalDateTime dt1 = LocalDateTime.now(); // 2020-10-31T19:27:00
    System.out.println(dt1);
  }
}
