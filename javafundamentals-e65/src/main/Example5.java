package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example5 {

  public static void main(String[] args) {
    String date = "2020-10-31";

    DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.US);

    LocalDate ld = LocalDate.parse(date, df);

    System.out.println(ld);
  }
}
