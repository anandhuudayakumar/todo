package com.todo.todov1.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.todo.todov1.enums.Enum.STATUS;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;


public class LineItem {


    private String lineItemId;

    private String lineItemName;

    private String lineItemDescription;

    private STATUS lineItemStatus;

    private Boolean isDeleted;

    @JsonProperty("lineItemTargetedCompletionTime")
    private LocalDateTime lineItemTargetedCompletionTime;
    @JsonProperty("lineItemCreationDate")
    private LocalDateTime lineItemCreationDate;
    @JsonProperty("lineItemModificationDate")
    private LocalDateTime lineItemModificationDate;

    private User lineItemCreadtedUser;

    private User lineItemModifiedUser;

    public LineItem(){
        this.lineItemId = "";
        this.lineItemName = "";
        this.lineItemDescription = "";
        this.lineItemStatus = STATUS.NOT_STARTED;
        this.isDeleted = false;
        this.lineItemTargetedCompletionTime = LocalDateTime.now().plusDays(1);
        this.lineItemCreationDate = LocalDateTime.now();
        this.lineItemModificationDate = LocalDateTime.now();
        this.lineItemCreadtedUser = new User();
        this.lineItemModifiedUser = new User();
    }

    public String getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public String getLineItemName() {
        return lineItemName;
    }

    public void setLineItemName(String lineItemName) {
        this.lineItemName = lineItemName;
    }

    public String getLineItemDescription() {
        return lineItemDescription;
    }

    public void setLineItemDescription(String lineItemDescription) {
        this.lineItemDescription = lineItemDescription;
    }

    public STATUS getLineItemStatus() {
        return lineItemStatus;
    }

    public void setLineItemStatus(STATUS lineItemStatus) {
        this.lineItemStatus = lineItemStatus;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public LocalDateTime getLineItemTargetedCompletionTime() {
        return lineItemTargetedCompletionTime;
    }

    public void setLineItemTargetedCompletionTime(LocalDateTime lineItemTargetedCompletionTime) {
        this.lineItemTargetedCompletionTime = lineItemTargetedCompletionTime;
    }

    public LocalDateTime getLineItemCreationDate() {
        return lineItemCreationDate;
    }

    public void setLineItemCreationDate(LocalDateTime lineItemCreationDate) {
        this.lineItemCreationDate = lineItemCreationDate;
    }

    public LocalDateTime getLineItemModificationDate() {
        return lineItemModificationDate;
    }

    public void setLineItemModificationDate(LocalDateTime lineItemModificationDate) {
        this.lineItemModificationDate = lineItemModificationDate;
    }

    public User getLineItemCreadtedUser() {
        return lineItemCreadtedUser;
    }

    public void setLineItemCreadtedUser(User lineItemCreadtedUser) {
        this.lineItemCreadtedUser = lineItemCreadtedUser;
    }

    public User getLineItemModifiedUser() {
        return lineItemModifiedUser;
    }

    public void setLineItemModifiedUser(User lineItemModifiedUser) {
        this.lineItemModifiedUser = lineItemModifiedUser;
    }
}
