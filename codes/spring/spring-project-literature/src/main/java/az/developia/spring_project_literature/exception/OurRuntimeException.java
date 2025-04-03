package az.developia.spring_project_literature.exception;

import org.springframework.validation.BindingResult;

public class OurRuntimeException extends RuntimeException{
	private BindingResult br;

	public OurRuntimeException(BindingResult br, String message) {
		super(message);
		this.br = br;
	}
	
	public BindingResult getBr() {
		return br;
	}

}
