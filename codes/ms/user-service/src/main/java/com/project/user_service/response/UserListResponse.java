package com.project.user_service.response;

import java.util.List;

import com.project.user_service.entity.UserEntity;

public class UserListResponse {
	
	private List<UserEntity> userResponse;
	
	private List<UserResponse> userWithMovies;
	
	public UserListResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserListResponse(List<UserEntity> userResponse, List<UserResponse> userWithMovies) {
		super();
		this.userResponse = userResponse;
		this.userWithMovies = userWithMovies;
	}

	public List<UserEntity> getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(List<UserEntity> userResponse) {
		this.userResponse = userResponse;
	}

	public List<UserResponse> getUserWithMovies() {
		return userWithMovies;
	}

	public void setUserWithMovies(List<UserResponse> userWithMovies) {
		this.userWithMovies = userWithMovies;
	}

	
	
	
}
