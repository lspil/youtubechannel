package controllers;

import services.ProductService;

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
