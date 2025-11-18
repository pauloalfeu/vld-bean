package br.edu.ifpr.demo.domain;

import java.time.LocalDate;

import br.edu.ifpr.demo.validator.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @NotBlank(message = "Digita um nome")
    String name;
    LocalDate birthDate;

    @Impar(message = "mensagem personalizada")
    Integer numero;

    @PlacaValida
    String placa;

    @CNHValida
    String cnh;

    @AnoFabricacaoValido
    Integer anoCarro;

    @SemPalavrasOfensivas
    String comentario;

}
