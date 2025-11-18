package br.edu.ifpr.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class CNHValidaValidation implements ConstraintValidator<CNHValida, String> {
    private static final Pattern CNH_PATTERN = Pattern.compile("^\\d{11}$");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return CNH_PATTERN.matcher(value).matches();
    }
}


