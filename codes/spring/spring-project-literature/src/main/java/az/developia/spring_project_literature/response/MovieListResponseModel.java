package az.developia.spring_project_literature.response;

import java.util.List;

public class MovieListResponseModel {
	
	private List<MovieResponseModel> movieResponse;
	
	public MovieListResponseModel() {
		// TODO Auto-generated constructor stub
	}

	public MovieListResponseModel(List<MovieResponseModel> movieResponse) {
		super();
		this.movieResponse = movieResponse;
	}

	public List<MovieResponseModel> getMovieResponse() {
		return movieResponse;
	}

	public void setMovieResponse(List<MovieResponseModel> movieResponse) {
		this.movieResponse = movieResponse;
	}
	
	
}
