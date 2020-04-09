package my.app.invoicing.model;

public class Invoice {

    private String id;

    public Invoice(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
