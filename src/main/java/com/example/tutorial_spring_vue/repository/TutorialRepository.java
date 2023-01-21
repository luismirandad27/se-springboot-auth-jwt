package com.example.tutorial_spring_vue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tutorial_spring_vue.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial,Long>{
	
	List<Tutorial> findByPublished(boolean published);
	List<Tutorial> findByTitleContaining(String title);
	
	
}
