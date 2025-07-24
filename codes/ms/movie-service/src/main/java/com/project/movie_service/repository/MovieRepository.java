package com.project.movie_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.movie_service.entity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer>{
	
	List<MovieEntity> findAllByUserId(Integer userId);
}
