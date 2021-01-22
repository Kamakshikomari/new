package com.capgemini.presentation;

import com.capgemini.model.Address;
import com.capgemini.model.Student;

public class Main1 {

	public static void main(String[] args) {
		// object creation will take by Spring Framework
		Student student = new Student(1, "Deepthi Ravula", 80);
		
		// dependency for student object
		Address address = new Address("Tirupathi", "AP", "517507");
		
		// set the dependency
		// setting dependency will be done by Spring Framework
		student.setHomeAddress(address);
		
        System.out.println(student);
        System.out.println(student.getHomeAddress());
	}

}
