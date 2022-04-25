package main;

import config.AppConfig;
import controllers.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    // IoC -> DI, Aspects
    //var context = new ClassPathXmlApplicationContext();  // XML files
    //var context = new FileSystemXmlApplicationContext();

    var context = new AnnotationConfigApplicationContext(AppConfig.class);

    LoginController c1 = context.getBean(LoginController.class);

    System.out.println(c1);
  }
}
