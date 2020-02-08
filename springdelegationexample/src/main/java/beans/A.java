package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;

@Component
public class A {

    @Autowired
    private B b;

    @Autowired
    private A a;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void m1() {
        b.m2(); // will create a new transaction // B.class??? NOO  EnhancerBySpringCGLIB$$ec44bc4b
        this.m2(); // won't create a new transaction // A.class YESS
        a.m2(); // a new transaction will be created
        // why????
        System.out.println(b.getClass());
        System.out.println(this.getClass());
        System.out.println(a.getClass()); // A.class ?? NOOO
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void m2() {

    }
}
