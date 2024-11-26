package com.neoteric.streamspractice;

public class Subject {


    private String subject;

    private int marks;


    public Subject(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject='" + subject + '\'' +
                ", marks=" + marks +
                '}';
    }
}
