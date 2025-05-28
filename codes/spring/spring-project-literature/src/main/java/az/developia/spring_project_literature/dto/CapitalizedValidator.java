package az.developia.spring_project_literature.dto;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CapitalizedValidator implements ConstraintValidator<Capitalized, String>{
	
	@Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return !value.equals(value.toLowerCase());
    }
}
