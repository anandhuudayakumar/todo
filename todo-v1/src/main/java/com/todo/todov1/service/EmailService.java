package com.todo.todov1.service;

import org.apache.commons.mail.EmailException;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface EmailService {

    void sentEmail(String to, String subject, String message) throws EmailException;
    void sentMailAt(String to, String subject, String message, LocalDateTime time);
}
