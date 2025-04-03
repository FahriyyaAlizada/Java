package az.developia.spring_project_literature.dto;

public class BookResponseDto {
	private Integer id;
	private String title;
	private String author;
	private Integer year;
	
	public BookResponseDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BookResponseDto(Integer id, String title, String author, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	
	
}
