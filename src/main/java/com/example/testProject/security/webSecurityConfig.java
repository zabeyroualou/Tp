package com.example.testProject.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class webSecurityConfig {

//    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
//        return httpSecurity
//                .csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests(auth -> auth
//                        .requestMatchers("/login", "/images/**", "/css/**", "/js/**", "/fonts/**", "/img/**")
//                        .permitAll()
//                        .anyRequest()
//                        .authenticated()
//                        .and()
//                        .formLogin()
//                        .loginPage("/login")
//                        .defaultSuccessUrl("accueil", true)
//                        .and()
//                        .logout()
//                        .logoutSuccessUrl("/login")
//                        .invalidateHttpSession(true)
//                        .deleteCookies("JSESSIOND")
//                        .and()
//                        .exceptionHandling()
//                        .accessDeniedPage("/access-denied"))
//                        .build();
//    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
