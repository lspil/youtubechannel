package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    @Qualifier("en")
    private HelloService helloService;

    public void sayHello(String name) {
        String message = helloService.sayHello(name);
        System.out.println(message);
    }
}
