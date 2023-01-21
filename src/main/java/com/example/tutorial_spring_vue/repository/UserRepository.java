package com.example.tutorial_spring_vue.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.tutorial_spring_vue.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
