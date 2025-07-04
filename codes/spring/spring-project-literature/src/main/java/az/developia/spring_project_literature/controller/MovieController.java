package az.developia.spring_project_literature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.MovieRequestDto;
import az.developia.spring_project_literature.dynamic.DynamicFiltering;
import az.developia.spring_project_literature.entity.Movie;
import az.developia.spring_project_literature.entity.TestEntity;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.MovieRepository;
import az.developia.spring_project_literature.response.MovieListResponseModel;
import az.developia.spring_project_literature.response.MovieResponse;
import az.developia.spring_project_literature.response.MovieResponseDto;
import az.developia.spring_project_literature.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Movie Controller",description = "Movie APIs")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private DynamicFiltering filtering;
	
	@GetMapping
	@Operation(
			description = "Get Movie",
			summary = "This is a summary for get Movie"
			)
 	public String getMovie() {
 		return "get movie";
 	}
	
	@PostMapping(path = "/add")
	@PreAuthorize("hasAuthority('ROLE_ADD_MOVIE')")
	@Operation(
			description = "Add Movie",
			summary = "This is a summary for add Movie"
			)
	public void create(@Valid @RequestBody MovieRequestDto dto,BindingResult br) {
 		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "");
		}
		movieService.add(dto);
	}
	
	@GetMapping(path = "/getAll")
	@Operation(
			description = "Get Movies",
			summary = "This is a summary for get Movies"
			)
	public MovieResponse getAll() {
		return movieService.get();
	}
	
	@GetMapping(path = "/pagination/begin/{begin}/length/{length}")
	public List<Movie> pagination(@PathVariable Integer begin, @PathVariable Integer length) {
		return movieService.findPagination(begin,length);
	}
	
    @GetMapping("/title")
	@Operation(
			description = "Get Title",
			summary = "This is a summary for get Title"
			)
    public List<String> getMovieTitles() {
        return movieService.getMovieTitle();
    }
    
	@DeleteMapping(path = "/{id}")
	@Operation(
			description = "Delete Movie",
			summary = "This is a summary for delete Movie"
			)
	public void deleteMovie(@PathVariable Integer id) {
		movieService.delete(id);
	}
	
	@GetMapping(path="/{id}",produces = {"application/json","application/xml"})
	public MovieResponseDto getById(@PathVariable Integer id) {
		return movieService.getMovieById(id);
	}
	
	@GetMapping(path = "/view")
	public List<TestEntity> getView(){
		return movieService.findView();
	}
	
	@PutMapping(path = "/update")
	public void movieUpdate(@Valid @RequestBody MovieRequestDto dto, BindingResult br) {
		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "");
		}
		movieService.update(dto);
	}
	
	@GetMapping(path = "/id-title")
	public MappingJacksonValue getMovieIdTitle() {
		MovieListResponseModel response = new MovieListResponseModel();
		List<Movie> movies = movieRepository.findAll();
		
		response.setMovieResponse(movieService.convertMovieToResponseModel(movies));
		return filtering.filter("movies", response, "id","title");
	}
	
	@GetMapping(path = "/title-genre")
	public MappingJacksonValue getMovieTitleGenre() {
		MovieListResponseModel response = new MovieListResponseModel();
		List<Movie> movies = movieRepository.findAll();
		
		response.setMovieResponse(movieService.convertMovieToResponseModel(movies));
		return filtering.filter("movies", response, "title","genre");
	}
}
