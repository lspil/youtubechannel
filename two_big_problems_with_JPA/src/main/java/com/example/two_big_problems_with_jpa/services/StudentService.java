package com.example.two_big_problems_with_jpa.services;

import com.example.two_big_problems_with_jpa.entities.Product;
import com.example.two_big_problems_with_jpa.entities.Student;
import com.example.two_big_problems_with_jpa.repositories.ProductRepository;
import com.example.two_big_problems_with_jpa.repositories.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;
  private final ProductRepository productRepository;

  public List<Student> getAllStudents() {
    return studentRepository.findAll();
  }

  public List<Student> getAllStudents2() {
    return studentRepository.findAll2();
  }

  public List<Product> getAllProducts() {
    var products = productRepository.findAll();
    products.forEach(p -> p.setPrice(0.9 * p.getPrice()));  /// --> maps the context to the DB
    return products;
  }
}
