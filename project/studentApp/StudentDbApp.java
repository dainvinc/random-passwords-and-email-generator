package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDbApp {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentDbApp db = new StudentDbApp();
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Vishal", "Koosuri", "A1234"));
		students.add(new Student("Michael", "Scott", "B2824"));
		students.add(new Student("Jon", "Snow", "C1209"));
		students.add(new Student("John", "Doe", "F1284"));
		
		System.out.println("There are currently "+students.size() +" students in DB");
		System.out.println("Do you want to add more?");
		String input = scan.nextLine();
		
		if(input.toLowerCase().contains("y")) {
			students.add(new Student(scan.nextLine(), scan.nextLine(), scan.nextLine()));
			System.out.println("New Student has been added successfully!");
		}
		
		System.out.println("Please, enroll the students");
		
		for(Student s: students) {
			System.out.println(s.getFirstName() +" has been enrolled in(Courses): ");
			
			int numOfCourses = scan.nextInt();
			s.enrollCourses(numOfCourses);
		}
		
		System.out.println("All the details of the Students are updated now!");
		db.getDetails(students);
		scan.close();
	}
	
	public void getDetails(List<Student> students) {
		for(Student s: students) {
			System.out.println(
					s.getFirstName()	+" || " 
					+s.getID() 	+" || "
					+s.coursesEnrolled() +" || "
			);
			
			s.getBalance();
		}
	}
}
