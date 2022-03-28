package br.com.mercadolivre.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class SubjectDTO {

    @NotBlank(message="O nome do assunto não pode ficar vazio.")
    @Pattern(regexp = "/^[A-Z][a-z0-9_-]{3,19}$/", message = "O nome do assunto deve começar com letra maiúscula.")
    @Size(max=30, message = "O comprimento do nome não pode exceder 30 caracteres.")
    String name;

    @NotBlank(message = "A nota não pode estar vazia.")
    @DecimalMax(value = "10.0", message = "A nota máxima é 10.0")
    @DecimalMin(value = "0.0", message = "A nota mínima é 0.0")
    Double score;
}
