package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class SpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		System.out.println(encoder.encode("india"));
		System.out.println(encoder.encode("nepal"));
				
	}
	
	@Bean
	BCryptPasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}

}



//INDIA
//ps $2a$10$m1CGZ./Hp7IpA/oaLgh1Iex98eHVB/jmSJj5VvZiMrUkViu8qML4i
//
//
//
//NEPAL
//
//ps     $2a$10$9urvpIYjrZqPjo6zIpUxaei8nBcJ/1ElcVrGFF.YG2QvyDulEKquu
