package exercise;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise6 {

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
        t1.setDestination("Paris");

        Ticket t2 = new Ticket();
        t2.setClient(c1);
        t2.setPrice(10);
        t2.setDestination("Paris");

        Ticket t3 = new Ticket();
        t3.setClient(c2);
        t3.setPrice(20);
        t3.setDestination("London");

        List<Ticket> list = List.of(t1,t2,t3);

        String res =
            list.stream()
                    .map(t -> t.getDestination())
                    .distinct()
                    .collect(Collectors.joining(","));

        System.out.println(res);

    }
}
