package com.spring_rest_jpa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.spring_rest_jpa.filter.JwtAuthFilter;
import com.spring_rest_jpa.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {
	@Autowired
	JwtAuthFilter jwtAuthFilter;
	
	@Bean
	public AuthenticationManager authenticationManager(
			UserDetailsService userDetailsService,
			PasswordEncoder passwordEncoder) {
		DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider(userDetailsService);
		authenticationProvider.setPasswordEncoder(passwordEncoder);

		return new ProviderManager(authenticationProvider);
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
//		UserDetails admin = User.withUsername("Emma")
//						.password(encoder.encode("Watson"))
//						.roles("ADMIN")
//						.build();
//		UserDetails user = User.withUsername("user123")
//						.password(encoder.encode("pass123"))
//						.roles("USER, ADMIN")
//						.build();
//		UserDetails user1 = User.withUsername("abc")
//							.password(encoder.encode("abc123"))
//							.roles("USER")
//							.build();
//		return new InMemoryUserDetailsManager(admin, user, user1);
		return new UserDetailsServiceImpl();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf(csrf -> csrf.disable())
		.authorizeHttpRequests(auth -> auth.requestMatchers("/swagger-ui/**","/api/authors/**","/api/validate/**")
		.permitAll()
		.anyRequest()
		.authenticated())
		.addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class)
		.build();
	}

}
