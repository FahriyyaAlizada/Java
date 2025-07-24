package com.project.movie_service.response;

import java.util.List;

import com.project.movie_service.entity.MovieEntity;

public class MovieListResponse {
	
	private List<MovieEntity> movieResponse;
	
	public MovieListResponse() {
		// TODO Auto-generated constructor stub
	}

	public MovieListResponse(List<MovieEntity> movieResponse) {
		super();
		this.movieResponse = movieResponse;
	}

	public List<MovieEntity> getMovieResponse() {
		return movieResponse;
	}

	public void setMovieResponse(List<MovieEntity> movieResponse) {
		this.movieResponse = movieResponse;
	}
	
	
}
