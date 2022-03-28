package br.com.mercadolivre.obterdiploma.service;

import br.com.mercadolivre.obterdiploma.model.StudentDTO;

public interface IObterDiplomaService {

    StudentDTO analyzeScores(StudentDTO rq);
}
