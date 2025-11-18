package br.edu.ifpr.demo.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = AnoFabricacaoValidoValidation.class)
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AnoFabricacaoValido {
    String message() default "Carro muito antigo";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
