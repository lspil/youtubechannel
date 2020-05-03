package exercise;

import java.util.Optional;

public class Client {

    private String name;
    private String address;
    private Optional email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Optional getEmail() {
        return email;
    }

    public void setEmail(Optional email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", email=" + email +
                '}';
    }
}
