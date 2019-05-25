package services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String hello(String name) {
        String message = "Hello, " + name + "!";
        System.out.println( message );
        return message;
    }
}
