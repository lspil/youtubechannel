package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import service.ProductService;

@Component
public class ProductController {

  @Autowired
//  @Qualifier("amazon")
  private ProductService productService;

}
