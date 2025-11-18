package br.edu.ifpr.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Year;
import java.util.regex.Pattern;

public class AnoFabricacaoValidoValidation implements ConstraintValidator<AnoFabricacaoValido, Integer> {
    private static final Pattern CNH_PATTERN = Pattern.compile("^\\d{11}$");
    private static final int MIN_YEAR = 1886;
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        if (value == null) {
            return true;
        }
        int currentYear = Year.now().getValue();
        return value >= MIN_YEAR && value <= currentYear;
    }
}


