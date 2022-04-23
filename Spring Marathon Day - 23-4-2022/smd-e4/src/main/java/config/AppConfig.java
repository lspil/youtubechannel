package config;

import controllers.ProductController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.ProductService;

@Configuration
public class AppConfig {

  @Bean
  ProductController productController2() {
    return new ProductController(productService());
  }

  @Bean
  ProductController productController1() {
    return new ProductController(productService());
  }

  @Bean
  ProductService productService() {
    return new ProductService();
  }
}
