package br.edu.ifpr.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PlacaValidaValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PlacaValida {
    String message() default "Placa inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
