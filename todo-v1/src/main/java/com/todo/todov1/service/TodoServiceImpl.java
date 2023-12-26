package com.todo.todov1.service;

import com.todo.todov1.model.Todo;
import com.todo.todov1.repository.ToDoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.util.List;

@Service
public class TodoServiceImpl  implements TodoService{

    @Autowired
    private ToDoRepository toDoRepository;
    @Autowired
    private EmailService emailService;

    Logger logger = LoggerFactory.getLogger(TodoServiceImpl.class);

    @Autowired
    ThymeleafService thymeleafService;

    @Override
    public boolean createTodo(Todo todo) {

        try{
            toDoRepository.save(todo);
            String creationEmailSubject = todo.getTodoName()+" Created Successfully";

            Context context = new Context();
            String creationEmailMessage = thymeleafService.processTemplate("CreationEmailTemplate.html", context);
            emailService.sentEmail(todo.getEmail().getEmailEmailAddress(),creationEmailSubject, creationEmailMessage);
            logger.info("successfully send email to user: "+todo.getEmail().getEmailEmailAddress());
        }catch (Exception e){
            logger.info("error creating todo");
            logger.error(e.toString());
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteTodo(Todo todo) {
        try{
            toDoRepository.delete(todo);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public List<Todo> readAllTodo() {
        return toDoRepository.findAll();
    }

    @Override
    public Todo read(String id) {
        return toDoRepository.findById(id).orElse(new Todo());
    }

    @Override
    public Todo update(Todo todo) {
        return toDoRepository.save(todo);
    }
}
