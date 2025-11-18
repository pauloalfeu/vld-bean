package br.edu.ifpr.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Set;
import java.util.regex.Pattern;

public class SemPalavrasOfensivasValidation implements ConstraintValidator<SemPalavrasOfensivas, String> {
    private static final Set<String> FORBIDDEN = Set.of("burro", "idiota", "lixo,", "inutil", "pessimo", "ruim");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        String lower = value.toLowerCase();
        for (String word : FORBIDDEN) {
            if (lower.contains(word)) {
                return false;
            }
        }
        return true;
    }
}


