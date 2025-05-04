package az.developia.spring_project_literature.service;

import java.util.Map;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.AuthRequestDto;
import az.developia.spring_project_literature.entity.User;
import az.developia.spring_project_literature.exception.InvalidCredentialsException;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.UserRepository;
import az.developia.spring_project_literature.util.JwtUtil;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
 	private PasswordEncoder passwordEncoder;
	@Autowired
 	private JwtUtil jwtUtil;
 
 	public String create(AuthRequestDto dto) {
 		
 		Optional<User> byUsername = userRepository.findByUsername(dto.getUsername());
 		if (byUsername.isPresent()) {
			throw new OurRuntimeException(null,"Username exists");
		}
 		
 		String encode = passwordEncoder.encode(dto.getPassword());
 		
 		User user = new User();
 		user.setFirstName(dto.getFirstName());
 		user.setLastName(dto.getLastName());
 		user.setUsername(dto.getUsername());
 		user.setEmail(dto.getEmail());
 		user.setPassword(encode);
 		userRepository.save(user);
 		return "User created successfully!";
 		
 	}

	public String login(AuthRequestDto dto) {
		Optional<User> user = userRepository.findByUsername(dto.getUsername());
		
		if (!user.isPresent() || !passwordEncoder.matches(dto.getPassword(), user.get().getPassword())) {
			throw new InvalidCredentialsException("Username or password is incorrect");
		}
		return jwtUtil.generateToken(user.get().getUsername(),user.get().getFirstName(),user.get().getLastName(),user.get().getEmail());
	}
	

	public ResponseEntity<Map<String, String>> getUserDetails(String token) {
 		if (token.startsWith("Bearer")) {
 			token=token.substring(7);
 		}
 		Map<String,String> claims = jwtUtil.extractClaims(token);
 		return ResponseEntity.ok(claims); 
 		}
 
}
