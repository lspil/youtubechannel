package com.example.ssc29.confg;

import com.example.ssc29.security.DocumentPermissionEvaluator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.access.expression.method.MethodSecurityExpressionHandler;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.GlobalMethodSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ProjectConfig extends GlobalMethodSecurityConfiguration {

  @Bean
  public UserDetailsService uds () {
    var uds = new InMemoryUserDetailsManager();

    var u1 =
        User.withUsername("john")
            .password("12345")
            .authorities("read")
        .build();

    var u2 =
        User.withUsername("bill")
            .password("12345")
            .authorities("write")
            .build();

    uds.createUser(u1);
    uds.createUser(u2);

    return uds;
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
  }

  @Override
  protected MethodSecurityExpressionHandler createExpressionHandler() {
    var meh = new DefaultMethodSecurityExpressionHandler();
    meh.setPermissionEvaluator(permissionEvaluator());
    return meh;
  }

  private PermissionEvaluator permissionEvaluator() {
    return new DocumentPermissionEvaluator();
  }
}
