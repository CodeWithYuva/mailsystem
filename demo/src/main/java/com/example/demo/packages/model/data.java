package com.example.demo.packages.model;


public class data {

    private String recipient;
    private String msg;
    private String subject;

    public data() {
    }

    public data(String recipient, String msg, String subject, String attachements) {
        this.recipient = recipient;
        this.msg = msg;
        this.subject = subject;
        this.attachements = attachements;
    }

    public String getAttachements() {
        return attachements;
    }

    public void setAttachements(String attachements) {
        this.attachements = attachements;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    private String attachements;
}
