package com.example.ssc29.security;

import com.example.ssc29.model.Document;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DocumentMethodAuthorizationManager implements AuthorizationRuleManager {

  public boolean applySecurityPermissions(List<Document> returnedList, String auth) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();

    boolean docsBelongToTheAuthUser =returnedList.stream()
        .allMatch(d -> d.getUser().equals(username));

    boolean hasProperAuthority = authentication.getAuthorities().stream()
        .anyMatch(g -> g.getAuthority().equals(auth));

    return docsBelongToTheAuthUser && hasProperAuthority;
  }
}
