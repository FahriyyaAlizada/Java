package az.developia.spring_project_literature.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String title;
	private String genre;	
	private Integer rating;	
	private Integer userId;
	
	@OneToOne(mappedBy = "movie")
	private MovieDetail movieDetail;
	
	@ManyToOne
	private Category category;
	
	@ManyToMany(mappedBy = "movies")
	private List<User> viewers;
	
	public Movie() {
		
	}

	public Movie(Integer id, String title, String genre, Integer rating, Integer userId, MovieDetail movieDetail,
			Category category, List<User> viewers) {
		super();
		Id = id;
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.userId = userId;
		this.movieDetail = movieDetail;
		this.category = category;
		this.viewers = viewers;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public MovieDetail getMovieDetail() {
		return movieDetail;
	}

	public void setMovieDetail(MovieDetail movieDetail) {
		this.movieDetail = movieDetail;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<User> getViewers() {
		return viewers;
	}

	public void setViewers(List<User> viewers) {
		this.viewers = viewers;
	}
	
	
	
	
}
