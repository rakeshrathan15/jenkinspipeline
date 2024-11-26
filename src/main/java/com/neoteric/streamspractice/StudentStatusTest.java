package com.neoteric.streamspractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class StudentStatusTest {

    public static void main(String[] args) {
        List<Subject> subjectList= new ArrayList<>();

        Subject teluguSubject = new Subject("Telugu", 30);
        Subject hindiSubject = new Subject("Hindi",99);
        Subject englishSubject = new Subject("English",96);
        Subject mathsSubject= new Subject("Maths",99);
        Subject scienceSubject = new Subject("Science",89);
        Subject socialSubject = new Subject("Social",88);


        subjectList.add(teluguSubject);
        subjectList.add(hindiSubject);
        subjectList.add(englishSubject);
        subjectList.add(mathsSubject);
        subjectList.add(scienceSubject);
        subjectList.add(socialSubject);

        List<Status> statusList= new ArrayList<>();
        Status pass= new Status();
        pass.pass="pass";

        Status fail= new Status();
        fail.fail= "fail";


        statusList.add(pass);
        statusList.add(fail);


        List<Student> studentList = new ArrayList<>();

        Student student1 = new Student(subjectList,statusList);


        studentList.add(student1);



        Predicate<Student> studentPredicate = (student) -> {

            return student.getSubject().stream().allMatch(subject -> subject.getMarks() > 35);
        };


        studentList.stream()
                .filter(studentPredicate)
                .forEach(student -> System.out.println("Student passed with subjects: " + student.getSubject()));


        studentList.stream()
                .filter(studentPredicate.negate())
                .forEach(student -> System.out.println("Student failed with subjects: " + student.getSubject()));
    }




}
