package com.br.alansiq.todoapp.repository;

import com.br.alansiq.todoapp.model.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// model != dto
// CrudRepository<Modelo, tipo de dado chave primaria>

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {

}
