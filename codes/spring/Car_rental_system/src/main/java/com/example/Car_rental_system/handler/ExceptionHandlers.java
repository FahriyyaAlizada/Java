package com.example.Car_rental_system.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.Car_rental_system.exception.OurRuntimeException;
import com.example.Car_rental_system.response.ExceptionResponse;
import com.example.Car_rental_system.response.ValidationResponse;

@RestControllerAdvice
public class ExceptionHandlers {
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ExceptionResponse handler(OurRuntimeException exc) {
		
		ExceptionResponse response = new ExceptionResponse();
		
		BindingResult br = exc.getBr();
		if (br==null) {
			
		}
		else {
			List<FieldError> fieldErrors = br.getFieldErrors();
			List<ValidationResponse> validations = new ArrayList<ValidationResponse>();
			for (FieldError error : fieldErrors) {
				ValidationResponse validation = new ValidationResponse();
				validation.setField(error.getField());
				validation.setErrorMessage(error.getDefaultMessage());
				validations.add(validation);
			}
			response.setValidations(validations);
			
			}
		response.setMessage(exc.getMessage());
		return response;
	}
}
