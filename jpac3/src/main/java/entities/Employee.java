package entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "emp_date")
    @Temporal(TemporalType.DATE)	// TemporalType.DATE, TIMESTAMP, TIME
    private Date empDate;			// date, date & time, time

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getEmpDate() {
        return empDate;
    }

    public void setEmpDate(Date empDate) {
        this.empDate = empDate;
    }
}
