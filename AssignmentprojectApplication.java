package com.epiclearn.assignmentproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssignmentprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentprojectApplication.class, args);
		// create a object student class
		Student student=new Student();
		student.startLearning();

		//create the object alertService class and pass the parameeters
		AlertService service=new AlertService("Sending Email: System update available!","Sending SMS: System update available!");
		service.alertUser();

	}

}
