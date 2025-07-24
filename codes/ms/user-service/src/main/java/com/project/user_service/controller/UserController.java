package com.project.user_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.user_service.entity.UserEntity;
import com.project.user_service.repository.UserRepository;
import com.project.user_service.response.UserListResponse;

@RestController
@RequestMapping(path = "/users")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path = "/getAll")
	public UserListResponse getUser() {
		UserListResponse response = new UserListResponse();
		
		List<UserEntity> users = userRepository.findAll();
		
		response.setUserResponse(users);
		
		return response;
	}
}
