package az.developia.spring_project_literature.validation;

import az.developia.spring_project_literature.dto.Capitalized;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CapitalizedValidator implements ConstraintValidator<Capitalized, String>{
	
	@Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        return Character.isUpperCase(value.charAt(0));
    }
}
