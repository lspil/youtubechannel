package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.ProductRepository;

public class Main {

    public static void main(String[] args) {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            var r = c.getBean(ProductRepository.class);
            r.addProduct("Beer");
        }
    }
}
