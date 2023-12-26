package com.todo.todov1.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class ThymeleafService {

    @Autowired
    private TemplateEngine templateEngine;

    public String processTemplate(String templateName, Context context) {
        return templateEngine.process(templateName, context);
    }
}
