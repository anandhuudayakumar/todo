package com.todo.todov1.repository;

import com.todo.todov1.model.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends MongoRepository<Todo, String> {
}
