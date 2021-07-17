package com.zup.apibooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zup.apibooks.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
	
}
