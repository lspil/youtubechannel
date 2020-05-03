package exercise;


import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {
        Client c1 = new Client();

        Ticket t1 = new Ticket();
        t1.setDestination("Paris");

        Ticket t2 = new Ticket();
        t2.setDestination("Paris");

        Ticket t3 = new Ticket();
        t3.setDestination("London");

        String dest = "Paris";

        List<Ticket> list = List.of(t1,t2,t3);

        long res1 =  // 2
            list.stream()
                    .filter(t -> t.getDestination().equals(dest))
                    .count();

        System.out.println(res1);
    }
}
