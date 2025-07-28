package com.project.user_service.response;

import java.util.List;

public class MovieListResponse {
	
	private List<MovieResponse> movieResponse;
	
	public MovieListResponse() {
		// TODO Auto-generated constructor stub
	}

	public MovieListResponse(List<MovieResponse> movieResponse) {
		super();
		this.movieResponse = movieResponse;
	}

	public List<MovieResponse> getMovieResponse() {
		return movieResponse;
	}

	public void setMovieResponse(List<MovieResponse> movieResponse) {
		this.movieResponse = movieResponse;
	}
	
	
}
