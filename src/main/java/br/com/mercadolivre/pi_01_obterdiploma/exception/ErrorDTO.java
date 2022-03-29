package br.com.mercadolivre.pi_01_obterdiploma.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorDTO {
    private String name;
    private String info;
}
