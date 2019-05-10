package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    @Qualifier("cat1")
    private Cat cat;

    public Cat getCat() {
        return cat;
    }


    public void setCat(Cat cat) {
        // some other stuff as well
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }
}
