package entities.pk;

import java.io.Serializable;

public class DepartmentPK implements Serializable {

    private String name;
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int number) {
        this.no = number;
    }
}
