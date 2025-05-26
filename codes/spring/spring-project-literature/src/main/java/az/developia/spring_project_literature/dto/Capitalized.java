package az.developia.spring_project_literature.dto;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.*;

import az.developia.spring_project_literature.validation.CapitalizedValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Documented
@Constraint(validatedBy = CapitalizedValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Capitalized {
	
	String message() default "Title must start with an uppercase letter";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
