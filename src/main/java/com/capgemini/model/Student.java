package com.capgemini.model;

public class Student {
	private int studentId;
	private String studentName;
	private double score;
	
	private Address homeAddress;
	
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	
	public Student() {
		System.out.println("D");
		
	}
	public Student(Address address) {
		this.homeAddress=address;
		System.out.println("P");
	}

	public Student(int studentId, String studentName, double score) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.score = score;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", score=" + score + "]";
	}
	
}
