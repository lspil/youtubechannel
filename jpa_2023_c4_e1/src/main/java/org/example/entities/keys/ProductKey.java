package org.example.entities.keys;

import java.io.Serializable;
import java.util.Objects;

public class ProductKey implements Serializable {

    private String code;
    private long number;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductKey that = (ProductKey) o;
        return number == that.number && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, number);
    }
}
