package com.neoteric.stramsdemo;

public class Student {

    private String subjects;
    private int marks;

    private String status;

    public Student(String subjects, int marks) {
        this.subjects = subjects;
        this.marks = marks;
    }

    public Student(String subjects, int marks, String status) {
        this.subjects = subjects;
        this.marks = marks;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
