package com.example.sr_c2_e2.handlers;

import com.example.sr_c2_e2.model.Product;
import com.example.sr_c2_e2.service.ProductService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@Component
public class ProductHandler {

  private final ProductService productService;

  public ProductHandler(ProductService productService) {
    this.productService = productService;
  }

  public Mono<ServerResponse> getAll(ServerRequest request) {
    return ok().contentType(MediaType.TEXT_EVENT_STREAM).body(productService.getAll(), Product.class);
  }
}
