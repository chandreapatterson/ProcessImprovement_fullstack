package com.globalcontrols.processimprovement.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authz -> authz
                .requestMatchers("/public/**").permitAll()  // Public access for certain URLs
                .anyRequest().authenticated()  // Require authentication for all other URLs
            )
            .formLogin(form -> form
                .loginPage("/login")  // Custom login page (optional)
                .permitAll()  // Allow everyone to access the login page
            )
            .httpBasic();  // Deprecated

        return http.build();
    }
}
