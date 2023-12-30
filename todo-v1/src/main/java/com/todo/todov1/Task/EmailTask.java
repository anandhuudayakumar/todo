package com.todo.todov1.Task;

import com.todo.todov1.model.Todo;
import com.todo.todov1.service.EmailService;
import org.apache.commons.mail.EmailException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.TimerTask;

public class EmailTask extends TimerTask {
    private final String to;
    private final String subject;
    private final String message;
    @Autowired
    private EmailService emailService;

    public EmailTask(String to, String subject, String message){
        this.to=to;
        this.subject=subject;
        this.message=message;
    }
    @Override
    public void run() {
        try {
            emailService.sentEmail(to,subject,message);
        } catch (EmailException e) {
            throw new RuntimeException(e);
        }
    }
}
