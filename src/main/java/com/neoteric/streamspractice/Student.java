package com.neoteric.streamspractice;

import java.util.List;

public class Student {

    private List<Subject> subject;



    private List<Status> status;

    public Student(List<Subject> subject, List<Status> status) {
        this.subject = subject;
        this.status = status;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public List<Status> isStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + subject +
                ", status=" + status +
                '}';
    }
}
