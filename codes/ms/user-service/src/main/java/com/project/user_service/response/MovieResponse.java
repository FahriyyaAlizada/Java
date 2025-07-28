package com.project.user_service.response;

public class MovieResponse {
	
	private Integer Id;
	private String title;
	private Integer userId;
	
	public MovieResponse() {
		// TODO Auto-generated constructor stub
	}

	public MovieResponse(Integer id, String title, Integer userId) {
		super();
		Id = id;
		this.title = title;
		this.userId = userId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
