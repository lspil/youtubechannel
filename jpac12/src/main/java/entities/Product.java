package entities;

import javax.persistence.*;

@Entity
@NamedQuery(name = "Product.all", query = "SELECT p FROM Product p")
@NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id")
@Table(name="product")
public class Product {

    @Id
    private int id;

    private String name;
    private double price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
