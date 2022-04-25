package main;

import config.AppConfig;
import controllers.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(AppConfig.class);

    var p = c.getBean(DemoController.class);

    System.out.println(p.getClass());
    int result = p.doubleValue(10);

    System.out.println(result);
  }
}
