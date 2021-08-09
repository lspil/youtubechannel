package entities;

import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@Table(name="document")
public class Document {

    private String number;
    private String reference;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
