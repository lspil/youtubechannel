package com.example.two_big_problems_with_jpa.controllers;

import com.example.two_big_problems_with_jpa.entities.Product;
import com.example.two_big_problems_with_jpa.entities.Student;
import com.example.two_big_problems_with_jpa.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping("/students")
  public List<Student> findAllStudents() {
    return studentService.getAllStudents();
  }

  @GetMapping("/students2")
  public List<Student> findAllStudents2() {
    return studentService.getAllStudents2();
  }

  @GetMapping("/discount")
  public List<Product> getAllWithDiscount() {
    return studentService.getAllProducts();
  }
}
