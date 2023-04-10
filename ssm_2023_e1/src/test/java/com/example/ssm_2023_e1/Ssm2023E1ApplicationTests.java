package com.example.ssm_2023_e1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class Ssm2023E1ApplicationTests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("""
      When calling the /hello endpoint authenticated we should get back Hello in the response body,
      and an http status of 200 OK.
      """)
  @WithMockUser  // creates a mock security context
  void helloAuthenticatedTest() throws Exception {

    mockMvc.perform(get("/hello"))
        .andExpect(status().isOk())
        .andExpect(content().string("Hello"));
  }

  @Test
  @DisplayName("""
      When calling the /hello endpoint unauthenticated we should get back Hello in the response body,
      and an http status of 401 Unauthorized.
      """)
  void helloUnauthenticatedTest() throws Exception {
    mockMvc.perform(get("/hello"))
        .andExpect(status().isUnauthorized());
  }
}
