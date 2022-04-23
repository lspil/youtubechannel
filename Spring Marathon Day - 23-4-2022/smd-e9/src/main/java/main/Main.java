package main;

import config.AppConfig;
import controllers.ProductController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.ProductService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(AppConfig.class); // eager instantiation

    var p1 = c.getBean(ProductController.class);

//    var p1 = c.getBean(ProductController.class);
//    var p2 = c.getBean(ProductController.class);
//    var p3 = c.getBean(ProductController.class);
//
//    System.out.println(p1.getProductService());
//    System.out.println(p2.getProductService());
//    System.out.println(p3.getProductService());

//    var s1 = c.getBean(ProductService.class);
//    var s2 = c.getBean(ProductService.class);
//
//    System.out.println(s1);
//    System.out.println(s2);
  }
}
