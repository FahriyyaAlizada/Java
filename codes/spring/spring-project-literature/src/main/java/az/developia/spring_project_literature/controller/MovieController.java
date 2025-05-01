package az.developia.spring_project_literature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.MovieRequestDto;
import az.developia.spring_project_literature.response.MovieResponse;
import az.developia.spring_project_literature.service.MovieService;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "*")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping
 	public String getMovie() {
 		return "get movie";
 	}
	
	@PostMapping(path = "/add")
	public void create(@RequestBody MovieRequestDto dto) {
		movieService.add(dto);
	}
	
	@GetMapping(path = "/getAll")
	public MovieResponse getAll() {
		return movieService.get();
	}
}
