package config;

import controllers.ProductController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import service.AmazonProductService;
import service.ManningProductService;

@Configuration
@ComponentScan(basePackages = {"controllers", "service"})
public class AppConfig {

}
