package com.email.emailApi.model;

public class emailRequest {
    private String subject;
    private String message;
    private String to;

    public emailRequest() {
    }

    public emailRequest(String subject, String message, String to) {
        this.subject = subject;
        this.message = message;
        this.to = to;
    }

    // getter and setter methods
    public String getSubject() {
        return subject;
    }

    public String getMessage() {
        return message;
    }

    public String getTo() {
        return to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return "EmailRequest{" +
                " subject='" + getSubject() + "'"
                + ", message='" + getMessage() + "'"
                + ", to='" + getTo() + "'"
                + "}";
    }

}
