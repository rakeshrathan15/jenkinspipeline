package com.neoteric.stramsdemo;

public class StudentComparator
{



    private  String studentName;
    private String id;

    public StudentComparator(String studentName, String id) {
        this.studentName = studentName;
        this.id = id;
    }


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
