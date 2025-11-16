package com.epiclearn.assignmentproject;

public class Student extends Course{

    public Student(){
        //create a object Course class
        Course cs=new Course();
        // call the displayCourse method for using object
        cs.displayCourse();
    }
    public void startLearning(){
        System.out.println("Student has start learning");
    }
}
