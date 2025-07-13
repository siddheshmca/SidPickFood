package com.qualys.java.FoodPick.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity https) throws Exception {
		https.csrf(csrf -> csrf.disable()).headers(headers -> headers.frameOptions().disable())
				.authorizeHttpRequests(auth -> auth.requestMatchers("/h2-console/**", "/welcome/**","/foodpick/customers","/foodpick/customers/**","/foodpick/restaurant","/foodpick/restaurant/**")
						.permitAll().anyRequest().authenticated());
		return https.build();
	}
}
