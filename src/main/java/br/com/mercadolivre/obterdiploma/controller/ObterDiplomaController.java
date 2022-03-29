package br.com.mercadolivre.obterdiploma.controller;

import br.com.mercadolivre.obterdiploma.model.StudentDTO;
import br.com.mercadolivre.obterdiploma.service.IObterDiplomaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ObterDiplomaController {

    @Autowired
    IObterDiplomaService service;

    @PostMapping("/analyzeScores")
    public StudentDTO analyzeScores(@RequestBody @Valid StudentDTO rq) {
        return service.analyzeScores(rq);
    }
}
