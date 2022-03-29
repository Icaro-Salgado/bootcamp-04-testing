package br.com.mercadolivre.pi_02_obterdiploma.repository;

import br.com.mercadolivre.pi_02_obterdiploma.model.StudentDTO;

import java.util.Set;

public interface IStudentRepository {

    Set<StudentDTO> findAll();

}
