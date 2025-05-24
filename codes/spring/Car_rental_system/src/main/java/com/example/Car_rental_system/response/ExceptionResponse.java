package com.example.Car_rental_system.response;

import java.util.List;

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
