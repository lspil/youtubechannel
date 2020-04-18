package com.laurentiuspilca.springj142.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public record User (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        int id,
        String username,
        String password
) {

}
