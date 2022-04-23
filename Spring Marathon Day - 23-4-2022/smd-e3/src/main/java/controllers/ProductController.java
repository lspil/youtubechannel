package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import services.ProductService;

@Component
public class ProductController {

  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  public void addProduct() {
    productService.addProduct();
  }

  public ProductService getProductService() {
    return productService;
  }

}
