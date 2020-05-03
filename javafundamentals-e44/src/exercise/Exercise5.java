package exercise;


import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Exercise5 {

    public static void main(String[] args) {
        Client c1 = new Client();
        c1.setName("Bob");
        c1.setEmail(Optional.of("bob@bob.com"));

        Client c2 = new Client();
        c2.setName("John");
        c2.setEmail(Optional.of("john@john.com"));

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

        boolean res =
            list.stream()
                .map(t -> t.getClient())
                .allMatch(c -> c.getEmail().isPresent());

        System.out.println(res); // true
    }
}
