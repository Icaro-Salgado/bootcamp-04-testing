package br.com.mercadolivre.obterdiploma.controller;

import br.com.mercadolivre.obterdiploma.exception.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ObterDiplomaAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    protected ResponseEntity<List<ErrorDTO>> handleValidationExceptions(MethodArgumentNotValidException e) {
        List<ErrorDTO> errors = new ArrayList<>();
        e.getAllErrors().forEach(err -> errors.add(new ErrorDTO("Erro de validação", err.getDefaultMessage())));

//        ErrorDTO error = new ErrorDTO("Campo inválido", e.getBindingResult().getFieldError().getDefaultMessage());
        return ResponseEntity.badRequest().body(errors);
    }
}
