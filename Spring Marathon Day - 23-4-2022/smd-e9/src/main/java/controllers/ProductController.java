package controllers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import services.ProductService;

@Component
@Lazy
public class ProductController {

  private final ProductService productService;
  private final ApplicationContext context;

  public ProductController(ProductService productService,
                           ApplicationContext context) {
    this.productService = productService;
    this.context = context;
    System.out.println("ProductController created");
  }

  public ProductService getProductService() {
    return context.getBean(ProductService.class);
  }
}
