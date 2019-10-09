package entities.embedabbles;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String no;
    private String str;
    private String city;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String street) {
        this.str = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
