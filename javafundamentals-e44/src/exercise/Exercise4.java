package exercise;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercise4 {

    public static void main(String[] args) {
        Client c1 = new Client();
        c1.setName("Bob");

        Client c2 = new Client();
        c2.setName("John");

        Ticket t1 = new Ticket();
        t1.setClient(c1);
        t1.setPrice(10);

        Ticket t2 = new Ticket();
        t2.setClient(c1);
        t2.setPrice(10);

        Ticket t3 = new Ticket();
        t3.setClient(c2);
        t3.setPrice(20);


        List<Ticket> list = List.of(t1,t2,t3);

        OptionalDouble res1 =
            list.stream()
                .mapToDouble(t -> t.getPrice())
                .average();

        System.out.println(res1);

        DoubleSummaryStatistics s =
            list.stream()
                    .mapToDouble(t -> t.getPrice())
                    .summaryStatistics();

        System.out.println(s.getAverage());

        Double res3 =
            list.stream()
                .collect(Collectors.averagingDouble(t -> t.getPrice()));

        System.out.println(res3);
    }
}
