package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "my_generator")
    @TableGenerator(name = "my_generator", 
    table = "key_generator",
    pkColumnName = "key_name", 
    pkColumnValue = "product_sequence", 
    valueColumnName = "key_value", 
    allocationSize = 20)
    private int id;

    @Basic(optional = false)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
