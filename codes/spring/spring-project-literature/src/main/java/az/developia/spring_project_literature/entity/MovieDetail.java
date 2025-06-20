package az.developia.spring_project_literature.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movieDetails")
public class MovieDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	private String author;
	private Double imdb;
	
	@OneToOne
	private Movie movie;

	public MovieDetail() {
		// TODO Auto-generated constructor stub
	}

	public MovieDetail(Integer id, String author, Double imdb, Movie movie) {
		super();
		Id = id;
		this.author = author;
		this.imdb = imdb;
		this.movie = movie;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getImdb() {
		return imdb;
	}

	public void setImdb(Double imdb) {
		this.imdb = imdb;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	

}
