package com.capgemini.presentation;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.model.Student;

public class Main2 {

	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Student student=(Student) factory.getBean("student3");
		
		System.out.println(student);
		System.out.println(student.getHomeAddress());
	}

}
