package com.example.smde12;

import com.example.smde12.entities.Product;
import com.example.smde12.repositories.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SmdE12ApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private ProductRepository productRepository;

  @Test
  @DisplayName("""
      If the get all products endpoint is called without authentication then the
      result should be an HTTP 401 unauthenticated.
      """)
  void getAllProductsUnauthorizedTest() throws Exception {
    mockMvc.perform(get("/api/product"))
        .andExpect(status().isUnauthorized());
  }

  @Test
  @DisplayName("""
      If the get all products endpoint is called with authentication then the
      result should be an HTTP 200 unauthenticated.
      """)
  @WithMockUser
  void getAllProductsAuthorizedTest() throws Exception {
    ObjectMapper mapper = new ObjectMapper();

    var p1 = new Product();
    p1.setId(1);
    p1.setName("Beer");
    p1.setPrice(BigDecimal.TEN);

    var result = List.of(p1);

    when(productRepository.findAll()).thenReturn(result);

    mockMvc.perform(get("/api/product"))
        .andExpect(status().isOk())
        .andExpect(content().json(mapper.writeValueAsString(result)));
  }

}
