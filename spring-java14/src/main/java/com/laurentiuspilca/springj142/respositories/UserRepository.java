package com.laurentiuspilca.springj142.respositories;

import com.laurentiuspilca.springj142.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
