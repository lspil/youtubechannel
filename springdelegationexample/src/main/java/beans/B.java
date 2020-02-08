package beans;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class B {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void m2() {

    }
}
