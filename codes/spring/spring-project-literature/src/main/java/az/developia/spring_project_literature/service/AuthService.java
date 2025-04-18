package az.developia.spring_project_literature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import az.developia.spring_project_literature.dto.AuthRequestDto;
import az.developia.spring_project_literature.entity.User;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.repository.UserRepository;

@Service
public class AuthService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
 	private PasswordEncoder passwordEncoder;
 
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
 
}
