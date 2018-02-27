package com.studentapp;

public interface Courses {
	int COURSECOST = 600;
	
	public default void listOfCourses() {
		System.out.println("History 101");
		System.out.println("Mathematics 101");
		System.out.println("English 101");
		System.out.println("Chemistry 101");
		System.out.println("Computer Science 101");
	}
	
	public default int calculateCourseCost(int numOfCourses) {
		return numOfCourses * 600;
	}
}
