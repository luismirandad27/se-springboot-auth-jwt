package com.example.tutorial_spring_vue.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tutorial_spring_vue.model.ERole;
import com.example.tutorial_spring_vue.model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	Optional<Role> findByName(ERole name);
}
