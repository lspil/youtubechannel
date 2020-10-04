package com.example.ssc29.security;

import com.example.ssc29.model.Document;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import java.io.Serializable;
import java.util.List;

public class DocumentPermissionEvaluator implements PermissionEvaluator {

  @Override
  public boolean hasPermission(Authentication authentication,
                               Object targetObject,
                               Object permission) {
    List<Document> returnedList = (List<Document>) targetObject;
    String username = authentication.getName();
    String auth = (String) permission;

    boolean docsBelongToTheAuthUser =returnedList.stream()
        .allMatch(d -> d.getUser().equals(username));

    boolean hasProperAuthority = authentication.getAuthorities().stream()
        .anyMatch(g -> g.getAuthority().equals(auth));

    return docsBelongToTheAuthUser && hasProperAuthority;
  }

  @Override
  public boolean hasPermission(Authentication authentication,
                               Serializable targetID,
                               String type,
                               Object permission) {
    return false;
  }
}
