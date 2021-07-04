package main;

import infrastructure.CreateSchema;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main {

    public static void main(String[] args) throws Exception {
        try (var c = new AnnotationConfigApplicationContext(ProjectConfig.class)) {
            // Init DB
            var init = c.getBean(CreateSchema.class);
            init.run();

            ProductService service = c.getBean(ProductService.class);
            service.addTenProducts(); // no transaction
        }
    }
}
