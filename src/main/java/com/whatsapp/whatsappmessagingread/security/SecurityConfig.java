package com.whatsapp.whatsappmessagingread.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import com.whatsapp.whatsappmessagingread.security.filter.AuthenticationFilter;
import com.whatsapp.whatsappmessagingread.security.filter.ExceptionHandlerFilter;
import com.whatsapp.whatsappmessagingread.security.filter.JWTAuthorizationFilter;

import lombok.AllArgsConstructor;

import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@AllArgsConstructor
public class SecurityConfig {

        @Bean
        public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
                http
                                .csrf(csrf -> csrf.disable())
                                .authorizeHttpRequests((authorize) -> authorize
                                                .requestMatchers("/v3/api-docs/**", "/swagger-ui/**")
                                                .permitAll()
                                                .anyRequest().authenticated())
                                .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
                                .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
                                .sessionManagement(session -> session
                                                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                return http.build();
        }

}