package az.developia.spring_project_literature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import az.developia.spring_project_literature.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByUserId(Integer id);

    @Query(value = "SELECT title FROM movie", nativeQuery = true)
    List<String> findAllTitles();

}
