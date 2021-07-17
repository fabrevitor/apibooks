package com.zup.apibooks.resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zup.apibooks.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User>findAll(){
		User u = new User(1L, "Vitor", "vitor_fabre@hotmail.com", "111.854.349-12", LocalDate.now());
		return ResponseEntity.ok().body(u);
	}
}
