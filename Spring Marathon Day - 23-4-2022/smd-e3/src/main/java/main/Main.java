package main;

import config.AppConfig;
import controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AppConfig.class);

    var c = context.getBean(ProductController.class);

    c.addProduct();
  }
}
