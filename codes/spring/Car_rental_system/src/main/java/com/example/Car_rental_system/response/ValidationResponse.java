package com.example.Car_rental_system.response;

public class ValidationResponse {
	
	private String field;
	private String errorMessage;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
