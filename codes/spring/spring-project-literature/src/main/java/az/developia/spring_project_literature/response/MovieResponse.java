package az.developia.spring_project_literature.response;

import java.util.List;

import az.developia.spring_project_literature.entity.Movie;

public class MovieResponse {
	private List<Movie> movies;
	
	public MovieResponse() {
		// TODO Auto-generated constructor stub
	}

	public MovieResponse(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
}
