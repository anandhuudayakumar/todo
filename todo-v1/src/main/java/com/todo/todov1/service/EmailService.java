package com.todo.todov1.service;

import org.apache.commons.mail.EmailException;

public interface EmailService {

    void sentEmail(String to, String subject, String message) throws EmailException;
}
