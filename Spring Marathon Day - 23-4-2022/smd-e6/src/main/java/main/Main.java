package main;

import config.AppConfig;
import controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(AppConfig.class);

    ProductController p = c.getBean(ProductController.class);


  }
}
