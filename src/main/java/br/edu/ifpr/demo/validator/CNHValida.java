package br.edu.ifpr.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CNHValidaValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CNHValida {
    String message() default "CNH inválida";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
