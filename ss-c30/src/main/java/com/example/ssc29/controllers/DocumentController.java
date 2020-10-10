package com.example.ssc29.controllers;

import com.example.ssc29.model.Document;
import com.example.ssc29.service.DocumentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DocumentController {

  private final DocumentService documentService;

  public DocumentController(DocumentService documentService) {
    this.documentService = documentService;
  }

  @GetMapping("/documents/{username}")
  public List<Document> findDocuments(@PathVariable String username) {
    return documentService.findDocuments(username);
  }
}
