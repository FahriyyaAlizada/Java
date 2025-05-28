package az.developia.spring_project_literature.dto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "Movie Request Dto",description = "DTO that receives data")
public class MovieRequestDto {
	
	private Integer id;
	@Capitalized()
	private String title;
	private String genre;	
	private Integer rating;	
	private Integer userId;
	
	public MovieRequestDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieRequestDto(Integer id, String title, String genre, Integer rating, Integer userId) {
		super();
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}
