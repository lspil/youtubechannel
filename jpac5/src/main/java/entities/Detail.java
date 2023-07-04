package entities;

import javax.persistence.*;

@Entity
@Table(name="detail")
public class Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int kcal;

    @JoinColumn(name = "product")
//    @OneToOne()
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
}
