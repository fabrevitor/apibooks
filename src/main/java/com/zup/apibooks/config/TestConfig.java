package com.zup.apibooks.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.zup.apibooks.entities.Book;
import com.zup.apibooks.entities.User;
import com.zup.apibooks.repository.BookRepository;
import com.zup.apibooks.repository.UserRepository;

// Classe de cfg para gerar dados de teste

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BookRepository bookRepository;
	
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		User u1 = new User(null, "João", "joão_fabre@hotmail.com", "999.854.349-12", LocalDate.now());
		User u2 = new User(null, "Paulo", "paulo_fabre@hotmail.com", "888.854.349-12", LocalDate.now());
	
		Book b1 = new Book(null, u1, 10, "Teste sem API Marvel", 40.0F, "Autor Sem API Marvel", "xpto Sem Api Marvel", "Descript Sem Api Marvel");
		Book b2 = new Book(null, u2, 10, "LIVRO 2 Teste sem API Marvel", 40.0F, "Autor Sem API Marvel 2", "xpto Sem Api Marvel2", "Descript Sem Api Marvel2");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		bookRepository.saveAll(Arrays.asList(b1, b2));
		
	}
	
	
}
