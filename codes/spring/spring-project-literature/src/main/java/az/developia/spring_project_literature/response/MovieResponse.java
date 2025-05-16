package az.developia.spring_project_literature.response;

import java.util.List;

import az.developia.spring_project_literature.entity.Movie;

public class MovieResponse {
	private List<String> movies;
	
	public MovieResponse() {
		// TODO Auto-generated constructor stub
	}

	public MovieResponse(List<String> movies) {
		super();
		this.movies = movies;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
	
}
