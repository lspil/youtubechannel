package exercise;


import java.time.LocalDate;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        Client c1 = new Client();
        c1.setName("Bob");

        Client c2 = new Client();
        c2.setName("John");

        Ticket t1 = new Ticket();
        t1.setClient(c1);

        Ticket t2 = new Ticket();
        t2.setClient(c1);

        Ticket t3 = new Ticket();
        t3.setClient(c2);

        String name = "Mary";

        List<Ticket> list = List.of(t1,t2,t3);

        boolean b =
            list.stream()
                .map(t -> t.getClient().getName())
                .anyMatch(n -> n.equals(name));
        System.out.println(b);
    }
}
