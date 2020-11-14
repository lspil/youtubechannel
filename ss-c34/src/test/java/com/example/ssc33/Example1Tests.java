package com.example.ssc33;

import com.example.ssc33.security.WithCustomUser;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
class Example1Tests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  @DisplayName("When calling the /demo endpoint without authentication we expect to get a 401 Unauthorized.")
  void testUnauthenticatedDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isUnauthorized());
  }

  @Test
  @WithCustomUser(authority = "write")
  void testAuthenticatedWithoutProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isForbidden());
  }

  @Test
  @WithCustomUser(authority = "read")
  void testAuthenticatedWithAProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(get("/demo"))
        .andExpect(status().isOk());
  }

}
