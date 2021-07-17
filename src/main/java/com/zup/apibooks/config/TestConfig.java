package com.zup.apibooks.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zup.apibooks.entities.User;
import com.zup.apibooks.repository.UserRepository;

// Classe de cfg para gerar dados de teste

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "João", "joão_fabre@hotmail.com", "999.854.349-12", LocalDate.now());
		User u2 = new User(null, "Paulo", "paulo_fabre@hotmail.com", "888.854.349-12", LocalDate.now());
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
