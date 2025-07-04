package az.developia.spring_project_literature.response;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter(value = "movies")
public class MovieResponseModel {
	private Integer Id;
	private String title;
	private String genre;
	private Integer rating;
	
	public MovieResponseModel() {
		// TODO Auto-generated constructor stub
	}

	public MovieResponseModel(Integer id, String title, String genre, Integer rating) {
		super();
		Id = id;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
}
