package az.developia.spring_project_2sentyabr.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
	@Id
	private String username;
	
	private String password;
	private Integer enabled;
	private String type;
	private String email;
	
	public UserEntity() {
		// TODO Auto-generated constructor stub
	}

	public UserEntity(String username, String password, Integer enabled, String type, String email) {
		super();
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.type = type;
		this.email = email;
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

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
