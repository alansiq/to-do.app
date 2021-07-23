package com.br.alansiq.todoapp.repository;


import com.br.alansiq.todoapp.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.config.Task;

public interface TodoRepository extends CrudRepository<Todo, Long> {
    
}
