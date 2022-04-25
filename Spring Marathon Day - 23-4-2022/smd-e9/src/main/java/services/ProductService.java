package services;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ProductService {

  public ProductService() {
    System.out.println("ProductService created");
  }
}
