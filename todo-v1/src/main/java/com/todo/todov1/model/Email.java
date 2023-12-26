package com.todo.todov1.model;

public class Email {

    private String id;
    private String emailAddress;
    private Boolean isPrimary;

    public Email(){
        this.id = "";
        this.emailAddress = "";
        this.isPrimary = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Boolean getPrimary() {
        return isPrimary;
    }

    public void setPrimary(Boolean primary) {
        isPrimary = primary;
    }
}
