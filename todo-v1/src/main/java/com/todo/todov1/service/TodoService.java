package com.todo.todov1.service;


import com.todo.todov1.model.Todo;

import java.util.List;

public interface TodoService {

    boolean createTodo(Todo todo);
    boolean deleteTodo(Todo todo);

    List<Todo> readAllTodo();

    Todo read(String id);

    Todo update(Todo todo);
}
