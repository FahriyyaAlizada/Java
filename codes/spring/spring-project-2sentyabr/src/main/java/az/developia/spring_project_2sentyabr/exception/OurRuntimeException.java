package az.developia.spring_project_2sentyabr.exception;

import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

public class OurRuntimeException extends RuntimeException {
	
	private BindingResult br;

	public OurRuntimeException(BindingResult br, String message) {
		super(message);
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}

}
