package main;

import config.ProjectConfig;
import demo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            Person p = c.getBean(Person.class);
            p.sayHello("Bill");
        }
    }
}
