package config;

import controllers.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  LoginController loginController1() {
    return new LoginController(); // this will be added to the Spring context
  }

  @Bean
  LoginController loginController2() {
    return new LoginController(); // this will be added to the Spring context
  }

  @Bean
  String str1() {
    return "Hello";
  }
}
