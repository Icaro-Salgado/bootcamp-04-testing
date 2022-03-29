package br.com.mercadolivre.pi_02_obterdiploma.repository;

import br.com.mercadolivre.pi_02_obterdiploma.model.StudentDTO;

public interface IStudentDAO {
    void save(StudentDTO stu);
    boolean delete(Long id);
    boolean exists(StudentDTO stu);
    StudentDTO findById(Long id);
}