package az.developia.spring_project_literature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.MovieRequestDto;
import az.developia.spring_project_literature.entity.Movie;
import az.developia.spring_project_literature.entity.User;
import az.developia.spring_project_literature.repository.MovieRepository;
import az.developia.spring_project_literature.repository.UserRepository;
import az.developia.spring_project_literature.response.MovieResponse;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;

	public void add(MovieRequestDto dto) {
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		Movie movie = new Movie();
		movie.setId(null);
		movie.setTitle(dto.getTitle());
		movie.setGenre(dto.getGenre());
		movie.setRating(dto.getRating());
		movie.setUserId(id);
		movieRepository.save(movie);
	}

	public MovieResponse get() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		MovieResponse response = new MovieResponse();
		response.setMovies(movieRepository.findByUserId(id));
		return response;
	}

    public List<String> getAllTitles() {
        return movieRepository.findAllTitles();
    }

}
