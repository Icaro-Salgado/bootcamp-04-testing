package br.com.mercadolivre.pi_02_obterdiploma.controller;

import br.com.mercadolivre.pi_02_obterdiploma.model.StudentDTO;
import br.com.mercadolivre.pi_02_obterdiploma.service.IObterDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ObterDiplomaController {

    @Autowired
    IObterDiplomaService service;

    @GetMapping("/analyzeScores/{studentId}")
    public StudentDTO analyzeScores(@PathVariable Long studentId) {
        return service.analyzeScores(studentId);
    }
}
