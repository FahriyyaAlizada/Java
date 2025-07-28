package com.project.user_service.response;

import java.util.List;

public class UserResponse {
	
	private Integer id;
	private String firstName;
	private String lastName;	
	
	private List<MovieResponse> movies;
	
	public UserResponse() {
		// TODO Auto-generated constructor stub
	}

	public UserResponse(Integer id, String firstName, String lastName, List<MovieResponse> movies) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.movies = movies;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<MovieResponse> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieResponse> movies) {
		this.movies = movies;
	}
	
	
}
