package com.example.two_big_problems_with_jpa.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "classrooms")
@Getter
@Setter
public class Classroom {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;

}
