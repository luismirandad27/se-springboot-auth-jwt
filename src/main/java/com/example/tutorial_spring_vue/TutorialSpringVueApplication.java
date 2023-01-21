package com.example.tutorial_spring_vue;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.tutorial_spring_vue.model.ERole;
import com.example.tutorial_spring_vue.model.Role;
import com.example.tutorial_spring_vue.repository.RoleRepository;


@SpringBootApplication
public class TutorialSpringVueApplication {
	
	public static void main(String[] args) {
		
		SpringApplication.run(TutorialSpringVueApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(RoleRepository roleRepo) {
		return args -> {
			roleRepo.save(new Role(ERole.ROLE_ADMIN));
			roleRepo.save(new Role(ERole.ROLE_MODERATOR));
			roleRepo.save(new Role(ERole.ROLE_USER));
		};
				
	}

}
