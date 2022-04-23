package main;

import config.AppConfig;
import controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(AppConfig.class);

    var c1 = context.getBean("productController1", ProductController.class);
    var c2 = context.getBean("productController2", ProductController.class);

    System.out.println(c1);
    System.out.println(c2);

    System.out.println(c1.getProductService());
    System.out.println(c2.getProductService());
  }
}
