package exercise;

import java.time.LocalDate;

public class Ticket {

    private String departure;
    private String destination;
    private LocalDate date; // java.time
    private Client client;
    private double price;

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", date=" + date +
                ", client=" + client +
                ", price=" + price +
                '}';
    }
}
