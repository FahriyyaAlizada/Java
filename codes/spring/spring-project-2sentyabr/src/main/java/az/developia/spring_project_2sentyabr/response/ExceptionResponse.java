package az.developia.spring_project_2sentyabr.response;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ExceptionResponse {

	private String message;
	private List<ValidationResponse> validations;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ValidationResponse> getValidations() {
		return validations;
	}
	public void setValidations(List<ValidationResponse> validations) {
		this.validations = validations;
	}
	@Override
	public String toString() {
		return "ExceptionResponse [message=" + message + ", validations=" + validations + "]";
	}
	
	
	
}
