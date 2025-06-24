package az.developia.spring_project_literature.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "my_view")
public class TestEntity {
	
	@Id
	private Integer movieId;
	private String movieTitle;
	private Integer userId;
	private String userName;
	
	public TestEntity() {
		// TODO Auto-generated constructor stub
	}

	public TestEntity(Integer movieId, String movieTitle, Integer userId, String userName) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.userId = userId;
		this.userName = userName;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
