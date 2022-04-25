package config;

import controllers.ProductController;
import org.springframework.beans.factory.annotation.Qualifier;
import service.AmazonProductService;
import service.ManningProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public ProductController productController() {
    return new ProductController();
  }

  @Bean
  @Qualifier("amazon")
  public AmazonProductService amazonProductService() {
    return new AmazonProductService();
  }

  @Bean
  @Qualifier("manning")
  public ManningProductService manningProductService() {
    return new ManningProductService();
  }
}
