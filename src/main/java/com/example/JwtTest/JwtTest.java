package com.example.JwtTest;

import com.example.JwtTest.user.Role;
import com.example.JwtTest.user.UserRepository;
import com.example.JwtTest.user.Users;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class JwtTest {

	public static void main(String[] args) {
		SpringApplication.run(JwtTest.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@EventListener(ApplicationReadyEvent.class)
	public void setupAdminUser() {
		if (!userRepository.findByEmail("admin@example.com").isPresent()) {
			Users admin = new Users();
			admin.setFirstName("Admin");
			admin.setLastName("User");
			admin.setEmail("admin@example.com");
			admin.setPassword(passwordEncoder.encode("adminPassword"));
			admin.setRole(Role.ADMIN);
			userRepository.save(admin);
		}
	}

}
