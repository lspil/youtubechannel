package service;

import org.springframework.stereotype.Component;

@Component
public class PurchaseService {

  private final ProductService productService;

  public PurchaseService(ProductService productService) {
    this.productService = productService;
  }

  public void m() {
    // productService.x()
  }
}
