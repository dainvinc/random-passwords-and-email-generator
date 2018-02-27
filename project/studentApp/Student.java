package com.studentapp;

public class Student implements Courses {
	private String firstName;
	private String lastName;
	private String ID;
	private int numOfCourses;
	
	public Student(String firstName, String lastName, String ID) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public void viewListOfCourses() {
		listOfCourses();
	}
	
	public int coursesEnrolled() {
		return numOfCourses;
	}
	
	public void enrollCourses(int numOfCourses) {
		this.numOfCourses = numOfCourses;
		getBalance();
	}
	
	public void getBalance() {
		System.out.println("Balance due: $" +numOfCourses * COURSECOST);
	}
}
