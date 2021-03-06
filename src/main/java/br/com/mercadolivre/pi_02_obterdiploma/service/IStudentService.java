package br.com.mercadolivre.pi_02_obterdiploma.service;


import br.com.mercadolivre.pi_02_obterdiploma.model.StudentDTO;

import java.util.Set;

public interface IStudentService {
    void create(StudentDTO stu);
    StudentDTO read(Long id);
    void update(StudentDTO stu);
    void delete(Long id);
    Set<StudentDTO> getAll();
}
