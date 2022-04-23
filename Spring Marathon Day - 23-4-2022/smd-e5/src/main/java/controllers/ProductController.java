package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import service.ProductService;

public class ProductController {

  @Autowired
  @Qualifier("amazon")
  private ProductService productService;

}
