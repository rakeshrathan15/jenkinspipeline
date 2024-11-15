package com.neoteric.dockerlearning.demo;

public class StudentRakesh {

   private String studentName;


   public String mobileNumber;

   public String id;





    StudentRakesh(){

    }

    public StudentRakesh(String studentName) {
        this.studentName = studentName;
    }


    public StudentRakesh(String studentName, String mobileNumber, String id) {
        this.studentName = studentName;
        this.mobileNumber = mobileNumber;
        this.id = id;
    }

















    public String admission(String studentName){
        return "hello";

    }

    public String admission(String studentName,String id){
        return "hello";

    }

    public String admission(String studentName,String mobileNumber,String address){
        return "hello";

    }


















    public static String join(String studentName,String id){
        return "hello";

    }









    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
