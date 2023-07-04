package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Entity
@Table(name="event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "event_time")
    //private LocalDateTime eventTime;
    private ZonedDateTime eventTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //public LocalDateTime getEventTime() {
    public ZonedDateTime getEventTime() {
        return eventTime;
    }

    //public void setEventTime(LocalDateTime eventTime) {
    public void setEventTime(ZonedDateTime eventTime) {
        this.eventTime = eventTime;
    }
}
