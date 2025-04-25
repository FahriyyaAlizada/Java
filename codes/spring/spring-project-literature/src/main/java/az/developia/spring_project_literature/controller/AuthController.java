package az.developia.spring_project_literature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.AuthRequestDto;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.service.AuthService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin(origins = "*")
public class AuthController {
	
	@Autowired
 	private AuthService service;
 
 	@PostMapping(path = "/register")
 	public String createUser(@Valid @RequestBody AuthRequestDto dto, BindingResult br) {
 		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "");
		}
 		return service.create(dto);
 	}
 	
 	@PostMapping(path="/login")
 	public String login(@RequestBody AuthRequestDto dto) {
 		return service.login(dto);
 	}
 	
}
