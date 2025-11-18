package br.edu.ifpr.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = SemPalavrasOfensivasValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SemPalavrasOfensivas {
    String message() default "Texto contém palavras ofensivas";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
