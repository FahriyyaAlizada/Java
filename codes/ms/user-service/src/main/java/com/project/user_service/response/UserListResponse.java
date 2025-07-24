package com.project.user_service.response;

import java.util.List;

import com.project.user_service.entity.UserEntity;

public class UserListResponse {
	
	private List<UserEntity> userResponse;
	
	public UserListResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserListResponse(List<UserEntity> userResponse) {
		super();
		this.userResponse = userResponse;
	}

	public List<UserEntity> getUserResponse() {
		return userResponse;
	}

	public void setUserResponse(List<UserEntity> userResponse) {
		this.userResponse = userResponse;
	}
	
	
}
