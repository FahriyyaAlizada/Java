package az.developia.spring_project_literature.dto;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = CapitalizedValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface Capitalized {
	
	public String message() default "Title must start with an uppercase letter";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
