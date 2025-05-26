package az.developia.spring_project_literature.handler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import az.developia.spring_project_literature.exception.InvalidCredentialsException;
import az.developia.spring_project_literature.exception.OurRuntimeException;
import az.developia.spring_project_literature.response.ExceptionResponse;
import az.developia.spring_project_literature.response.ValidationResponse;


@RestControllerAdvice
public class ExcptionHandlers {
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
	public ExceptionResponse handleInvalidCredentialsException(InvalidCredentialsException exc) {
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage(exc.getMessage());
		return response;
	}
	
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
	
	
	@ExceptionHandler
	@ResponseStatus(code = HttpStatus.BAD_REQUEST) //400
	public ExceptionResponse handlec(MethodArgumentTypeMismatchException exc) {
		ExceptionResponse response = new ExceptionResponse();
		response.setMessage("Id cannot be string");
		return response;
		
	}
}
