package az.developia.spring_project_literature.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Size;
@Schema(name = "Auth Request Dto",description = "DTO that receives data")
public class AuthRequestDto {
	
	@Size(min=2, max=50, message="Firstname should be min 2 and max 50 symbols")
	private String firstName;
	@Size(min=2, max=50, message="Lastname should be min 2 and max 50 symbols")
 	private String lastName;
 	private String username;
 	private String password;
 	private String email;
 	
 	public AuthRequestDto() {
		// TODO Auto-generated constructor stub
	}
 	
	public AuthRequestDto(String firstName, String lastName, String username, String password, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
 	
 	
}
