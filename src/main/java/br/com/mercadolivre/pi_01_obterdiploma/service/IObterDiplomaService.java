package br.com.mercadolivre.pi_01_obterdiploma.service;

import br.com.mercadolivre.pi_01_obterdiploma.model.StudentDTO;

public interface IObterDiplomaService {

    StudentDTO analyzeScores(StudentDTO rq);
}
