package com.example.demo.packages.model;


import jakarta.persistence.*;

@Entity
public class contentdata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int day;

    @Override
    public String toString() {
        return "contentdata{" +
                "day=" + day +
                ", topic='" + topic + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public String topic;
    public String content;

    public contentdata() {
    }

    public contentdata(int day, String topic, String content) {
        this.day = day;
        this.topic = topic;
        this.content = content;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
