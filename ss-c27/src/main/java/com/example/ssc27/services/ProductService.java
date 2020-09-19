package com.example.ssc27.services;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  /**
   * @PreAuthorize -> the authorization rules are validated before calling the protected method
   * @PostAuthorize -> the method is called, and only then the aspect validates the authorization rules.
   *
   * @PreFilter -> the method needs to have the parameter of type Collection or array
   *            -> the aspects intercepts the method call and validated the values inside the collection
   *
   * @PostFilter -> returned value needs to be a Collection or an array
   *             -> the aspect applies the authorization rules and returns only the values that comply
   */

//  @PreAuthorize("hasAuthority('write')")
  @PreAuthorize("#username == authentication.name")
  public List<String> findProductsForUser(String username) {
    return List.of("beer", "chocolate");
  }
}
