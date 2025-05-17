package az.developia.spring_project_literature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.MovieRequestDto;
import az.developia.spring_project_literature.response.MovieResponse;
import az.developia.spring_project_literature.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
@SecurityRequirement(name = "bearerAuth")
@Tag(name = "Movie Controller",description = "Movie APIs")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
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
	public void create(@RequestBody MovieRequestDto dto) {
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
}
