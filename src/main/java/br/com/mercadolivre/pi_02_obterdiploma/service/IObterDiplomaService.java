package br.com.mercadolivre.pi_02_obterdiploma.service;


import br.com.mercadolivre.pi_02_obterdiploma.model.StudentDTO;

public interface IObterDiplomaService {

    StudentDTO analyzeScores(Long studentId);
}
