package br.com.mercadolivre.obterdiploma.controller;

import br.com.mercadolivre.obterdiploma.exception.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ObterDiplomaAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<ErrorDTO> handleValidationExceptions(MethodArgumentNotValidException e) {
        ErrorDTO error = new ErrorDTO("Campo inválido", e.getBindingResult().getFieldError().getDefaultMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
