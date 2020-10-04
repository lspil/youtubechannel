package com.example.ssc29.service;

import com.example.ssc29.model.Document;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

  @PostAuthorize("hasPermission(returnObject, 'read')")
  public List<Document> findDocuments(String username) {
    var doc = new Document();
    doc.setUser("john");
    doc.setText("TEXT");
    return List.of(doc);
  }
}
