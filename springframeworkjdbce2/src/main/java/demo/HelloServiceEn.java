package demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("en")
public class HelloServiceEn implements HelloService {

    public String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
