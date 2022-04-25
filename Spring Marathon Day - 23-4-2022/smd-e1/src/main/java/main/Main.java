package main;

import config.AppConfig;
import controllers.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    // IoC -> DI, Aspects
    //var context = new ClassPathXmlApplicationContext();  // XML files
    //var context = new FileSystemXmlApplicationContext();

    var context = new AnnotationConfigApplicationContext(AppConfig.class);

    LoginController c1 = context.getBean("loginController1", LoginController.class);
    LoginController c2 = context.getBean("loginController2", LoginController.class);

    System.out.println(c1);
    System.out.println(c2);
  }
}
