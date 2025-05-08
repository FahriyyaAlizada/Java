package az.developia.spring_project_literature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import az.developia.spring_project_literature.entity.Movie;

@Transactional
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByUserId(Integer id);

    @Query(value = "SELECT title FROM movies", nativeQuery = true)
    List<String> findMovieTitles();

    @Query(value = "Delete from movies where user_id=?1", nativeQuery = true)
    @Modifying
	void deleteUserMovies(Integer userId);

}
