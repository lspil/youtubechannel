package entities;

import entities.embedabbles.BuildingPK;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Building {

    @EmbeddedId
    @AttributeOverride(name = "no", column = @Column(name = "number"))
    private BuildingPK id;

    private String name;

    public BuildingPK getId() {
        return id;
    }

    public void setId(BuildingPK id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
