package com.zup.apibooks.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.apibooks.entities.User;
import com.zup.apibooks.services.UserService;

//UserResource - Controller - Deixando de forma mais enxuta e levando as regras de negócio pra camada de Service

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>>findAll(){
		List<User> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	// Definindo uma busca de Usuário por id, utilizando o value no GetMapping e o PathVariable para especificar a url para permitir um id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
