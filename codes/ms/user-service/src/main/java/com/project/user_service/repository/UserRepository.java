package com.project.user_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.user_service.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}
