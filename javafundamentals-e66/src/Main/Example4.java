package Main;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example4 {

  public static void main(String[] args) {
    // LEGACY!!!

    Date d1 = new Date(); // now

    System.out.println(d1);

    Calendar c1 = Calendar.getInstance();
    Calendar c2 = new GregorianCalendar();

    c1.set(2020, 11, 20);  // LocalDate
    Date d2 = c1.getTime();

    System.out.println(d2);

  }
}
