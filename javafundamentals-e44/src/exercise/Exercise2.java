package exercise;


import java.time.LocalDate;
import java.util.List;

public class Exercise2 {

    public static void main(String[] args) {
        Client c1 = new Client();

        Ticket t1 = new Ticket();
        t1.setDate(LocalDate.of(2020, 5, 2));

        Ticket t2 = new Ticket();
        t2.setDate(LocalDate.of(2020, 5, 2));

        Ticket t3 = new Ticket();
        t3.setDate(LocalDate.of(2020, 6, 1));

        LocalDate date = LocalDate.of(2020, 5, 2);

        List<Ticket> list = List.of(t1,t2,t3);

        list.stream()
                    .filter(t -> t.getDate().isEqual(date))
                    .forEach(System.out::println);

    }
}
