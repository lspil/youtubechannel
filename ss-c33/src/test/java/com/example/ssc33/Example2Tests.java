package com.example.ssc33;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.security.test.context.support.WithUserDetails;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Example2Tests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("When calling the /demo endpoint without authentication we expect to get a 401 Unauthorized.")
  void testUnauthenticatedDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isUnauthorized());
  }

  @Test
  @WithUserDetails("bill")
  void testAuthenticatedWithoutProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isForbidden());
  }

  @Test
  @WithUserDetails("john")
  void testAuthenticatedWithProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isOk());
  }
}
