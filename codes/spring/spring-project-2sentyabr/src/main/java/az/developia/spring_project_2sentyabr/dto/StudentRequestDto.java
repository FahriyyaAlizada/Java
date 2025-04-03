package az.developia.spring_project_2sentyabr.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class StudentRequestDto {
	
	private Integer id;
	@Size(min=2, max=40, message="name should be between 2-40 symbols...")
	@NotEmpty
	private String name;
	@Size(min=2, max=40, message="surname should be between 2-40 symbols...")
	@NotBlank
	private String surname;
	
	@Past(message = "date should be past...")
	private LocalDate birthday;
	
	@Pattern(regexp = "[a-zA-Z]+@[a-z]+\\.[a-z]{2,4}")
	private String email;
	
	private String username;
	private String password;
	
	@NotNull(message = "age cannot be null...")
	@Min(value = 1, message = "age can be min 1...")
	@Max(value = 100, message = "age can be max 100...")
	private String age;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
