package com.zup.apibooks.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zup.apibooks.entities.Book;
import com.zup.apibooks.repository.BookRepository;

//BookService - Controller - Regras de negócio do controller
@Service
public class BookService {
	
	//Implementa sozinho com essa anotação
	@Autowired
	private BookRepository repository;
	
	public List<Book> findAll(){
		return repository.findAll();
	}
	
	public Book findById(Long id) {
		Optional<Book> obj = repository.findById(id);
		return obj.get();
	}
}
