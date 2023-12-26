package com.todo.todov1.service;

import org.apache.commons.mail.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService{

    Logger logger = LoggerFactory.getLogger(EmailServiceImpl.class);
    @Value("${email.sender.username}")
    private String senderUsername;

    @Value("${email.sender.password}")
    private String senderPassword;
    @Override
    public void sentEmail(String to, String subject, String message) throws EmailException {
        try{
            sendSimpleEmail(to,subject,message);
        }catch (Exception e){
            logger.error(e.toString());
            throw e;
        }
    }

    private void sendSimpleEmail(String to, String subject, String message) throws EmailException {
        to="anandhuudayakumar1@gmail.com";
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp-relay.brevo.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(senderUsername, senderPassword));
        email.setStartTLSEnabled(true);
        email.setFrom(senderUsername);
        email.addTo(to);
        email.setSubject(subject);
        email.setHtmlMsg(message);
        logger.info(email.send());
    }
}
