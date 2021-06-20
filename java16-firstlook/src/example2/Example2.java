package example2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ofPattern("B")
                .format(LocalTime.of(13, 0)));
    }
}
