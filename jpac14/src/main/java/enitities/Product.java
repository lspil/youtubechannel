package enitities;

import javax.persistence.*;

@Entity
@Cacheable(false)
public class Product extends GeneralEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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

    /*
    LOAD -- @PostLoad
    UPDATE -- @PreUpdate @PostUpdate
    REMOVE -- @PreRemove @PostRemove
    PERSIST -- @PrePersist @PostPersist
     */


    @PostLoad
    public void postLoad() {
        System.out.println("Entity " + this + " was loaded!");
    }

    @PreRemove
    public void preRemove() {
        System.out.println("Entity " + this + " will be removed.");
    }

    @PostRemove
    public void postRemove() {
        System.out.println("Entity " + this + " was removed.");
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", dateCreated=" + dateCreated +
                ", lastModified=" + lastModified +
                ", name='" + name + '\'' +
                '}';
    }
}
