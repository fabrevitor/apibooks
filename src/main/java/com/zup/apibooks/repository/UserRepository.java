package com.zup.apibooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zup.apibooks.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
