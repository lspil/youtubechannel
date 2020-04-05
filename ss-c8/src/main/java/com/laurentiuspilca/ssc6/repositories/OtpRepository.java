package com.laurentiuspilca.ssc6.repositories;

import com.laurentiuspilca.ssc6.entities.Otp;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface OtpRepository extends JpaRepository<Otp, Integer> {

    Optional<Otp> findOtpByUsername(String username);
}
