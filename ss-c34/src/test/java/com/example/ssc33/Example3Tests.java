package com.example.ssc33;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Example3Tests {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void testAuthenticatedWithoutProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(
        get("/demo").with(httpBasic("bill", "12345"))
    ).andExpect(status().isForbidden());
  }

  @Test
  void testAuthenticatedWithProperAuthDemoEndpoint() throws Exception {
    mockMvc.perform(
        get("/demo").with(httpBasic("john", "12345"))
    ).andExpect(status().isOk());
  }
}
