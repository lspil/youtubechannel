package com.example.ssc33;

import com.example.ssc33.services.NameService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.test.context.support.WithMockUser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class Example2Tests {

  @Autowired
  private NameService nameService;

  @Test
  void testUnauthenticatedGetName() {
    assertThrows(AuthenticationCredentialsNotFoundException.class,
        () -> {
          nameService.getName();
    });
  }

  @Test
  @WithMockUser(authorities = "write")
  void testAuthenticatedGetWithoutAProperAuth() {
    assertThrows(AccessDeniedException.class,
        () -> {
          nameService.getName();
        });
  }

  @Test
  @WithMockUser(authorities = "read")
  void testAuthenticatedGetWithAProperAuth() {
    String name = nameService.getName();

    assertEquals("Mary", name);
  }

}
