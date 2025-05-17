package az.developia.spring_project_literature.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.spring_project_literature.dto.AuthRequestDto;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping(path = "/auth")
@CrossOrigin(origins = "*")
@Tag(name = "Auth Controller",description = "Auth APIs")
public class AuthController {
	
	@Autowired
 	private AuthService service;
 
 	@PostMapping(path = "/register")
	@Operation(
			description = "Register User",
			summary = "This is a summary for register User"
			)
 	public String createUser(@Valid @RequestBody AuthRequestDto dto, BindingResult br) {
 		if (br.hasErrors()) {
			throw new OurRuntimeException(br, "");
		}
 		return service.create(dto);
 	}
 	
 	@PostMapping(path="/login")
	@Operation(
			description = "Login User",
			summary = "This is a summary for login User"
			)
 	public String login(@RequestBody AuthRequestDto dto) {
 		return service.login(dto);
 	}
 	
	@GetMapping(path = "/profile")
	@Operation(
			description = "Get Profile",
			summary = "This is a summary for get Profile"
			)
 	public ResponseEntity<Map<String, Object>> getUserDetails(@RequestHeader("Authorization") String token){
 		return service.getUserDetails(token);
 	}
	
	@DeleteMapping(path = "/{id}")
	@Operation(
			description = "Delete User",
			summary = "This is a summary for delete User"
			)
 	public void deleteUser(@PathVariable Integer id){
 		service.delete(id);
 	}
 	
}
