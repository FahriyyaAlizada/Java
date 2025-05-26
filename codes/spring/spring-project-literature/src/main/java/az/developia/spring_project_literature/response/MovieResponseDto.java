package az.developia.spring_project_literature.response;

public class MovieResponseDto {
	
	private Integer Id;
	private String title;
	private String genre;	
	private Integer rating;	
	
	public MovieResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public MovieResponseDto(Integer id, String title, String genre, Integer rating) {
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
