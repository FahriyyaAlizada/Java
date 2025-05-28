package az.developia.spring_project_literature.dto;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ValidEmailValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidEmail {
	
	public String message() default "Email must contain symbol '@'";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
