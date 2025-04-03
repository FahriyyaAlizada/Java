package az.developia.spring_project_literature.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class BookRequestDto {
	
	private Integer id;
	@Size(min=2, max=40, message="title should be between 2-40 symbols...")
	@NotEmpty
	private String title;
	@Size(min=2, max=40, message="author should be between 2-40 symbols...")
	@NotBlank
	private String author;
	private Integer year;
	
	
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
