package main;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.ProductService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(AppConfig.class);

    var p = c.getBean(ProductService.class);
  }

}
