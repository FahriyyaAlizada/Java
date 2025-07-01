package az.developia.spring_project_literature.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.MovieRequestDto;
import az.developia.spring_project_literature.entity.Movie;
import az.developia.spring_project_literature.entity.TestEntity;
import az.developia.spring_project_literature.entity.User;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.MovieRepository;
import az.developia.spring_project_literature.repository.UserRepository;
import az.developia.spring_project_literature.repository.ViewRepository;
import az.developia.spring_project_literature.response.MovieResponse;
import az.developia.spring_project_literature.response.MovieResponseDto;
import jakarta.validation.Valid;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ViewRepository viewRepository;
	
	@Autowired
	private ModelMapper mapper;

	public void add(MovieRequestDto dto) {
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		Movie movie = new Movie();
		movie.setId(null);
//		movie.setTitle(dto.getTitle());
//		movie.setGenre(dto.getGenre());
//		movie.setRating(dto.getRating());
		mapper.map(dto, movie);
		movie.setUserId(id);
		movieRepository.save(movie);
	}

	public MovieResponse get() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		MovieResponse response = new MovieResponse();
//		response.setMovies(movieRepository.findByUserId(id));
		
		List<Movie> movies = movieRepository.findByUserId(id);
		
		Function<Movie, String> f = new Function<Movie, String>() {
			
			@Override
			public String apply(Movie t) {
				return t.getTitle();
			}
		};
		
		Predicate<String> pre = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.contains("a");
			}
		};
		
		List<String> filteredMovies = movies.stream()
				.map(f).filter(pre).collect(Collectors.toList());
		response.setMovies(filteredMovies);
		
		return response;
	}

    public List<String> getMovieTitle() {
        return movieRepository.findMovieTitles();
    }

	public void delete(Integer id) {
		
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User operatorUser = userRepository.getUserByUsername(username);
		
		if (id == null || id<=0) {
			throw new OurRuntimeException(null, "Id is required");
		}
		
		Supplier<OurRuntimeException> supplier = new Supplier<OurRuntimeException>() {
			
		    @Override
		    public OurRuntimeException get() {
		        return new OurRuntimeException(null, "Id cannot be found");
		    }
		};

		Movie movie = movieRepository.findById(id).orElseThrow(supplier);
		
			if (movie.getUserId() == operatorUser.getId()) {
				movieRepository.deleteById(id);
			}
			else {
				throw new OurRuntimeException(null, "Delete your own movie");
			}
		}

	public MovieResponseDto getMovieById(Integer id) {
		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "Id is required");
		}
		Optional<Movie> movie = movieRepository.findById(id);
		if (movie.isPresent()) {
			MovieResponseDto res = new MovieResponseDto();
			res.setId(movie.get().getId());
			res.setTitle(movie.get().getTitle());
			res.setGenre(movie.get().getGenre());
			res.setRating(movie.get().getRating());
			return res;
		}else {
			throw new OurRuntimeException(null, "Id cannot be found");
		}
	}

	public List<Movie> findPagination(Integer begin, Integer length) {
		return movieRepository.pagination(begin, length);
	}

	public List<TestEntity> findView() {
		return viewRepository.findAll();
	}

	public void update(@Valid MovieRequestDto dto) {
		
		if (dto.getId() == null || dto.getId() <= 0) {
			throw new OurRuntimeException(null, "Id is required");
		}
		Optional<Movie> byId = movieRepository.findById(dto.getId());
		if (byId.isPresent()) {
			Movie movie = byId.get();
			mapper.map(dto, movie);
			movieRepository.save(movie);
		}else {
			throw new OurRuntimeException(null, "Id cannot be found");
		}
		
	}
		
	}

