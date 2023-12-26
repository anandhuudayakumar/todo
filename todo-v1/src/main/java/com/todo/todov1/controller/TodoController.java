package com.todo.todov1.controller;

import com.todo.todov1.model.Todo;
import com.todo.todov1.service.TodoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoService todoService;

    @GetMapping("/all")
    public List<Todo> getALlTodo(){
        return todoService.readAllTodo();
    }

    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable String id){
        return todoService.read(id);
    }
    @PostMapping("/create")
    public Boolean createTodo(@RequestBody Todo todo){
        return todoService.createTodo(todo);
    }

    @PostMapping("/update")
    public Todo updateTodo(@RequestBody Todo todo){
        return todoService.update(todo);
    }



}
