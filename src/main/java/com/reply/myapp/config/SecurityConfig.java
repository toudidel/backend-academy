package com.reply.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    http.authorizeHttpRequests(
            authz -> authz.requestMatchers("/public/**").permitAll().anyRequest().authenticated())
        .httpBasic(Customizer.withDefaults()) // Enables Basic Auth
        .csrf(csrf -> csrf.disable()); // Disable CSRF for non-browser APIs

    return http.build();
  }
}
