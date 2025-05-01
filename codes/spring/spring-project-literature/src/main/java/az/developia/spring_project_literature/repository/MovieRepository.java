package az.developia.spring_project_literature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.spring_project_literature.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{

	List<Movie> findByUserId(Integer id);

}
