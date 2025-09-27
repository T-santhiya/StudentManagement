package application.service;

import java.util.ArrayList;
import java.util.Scanner;

import application.model.Student;


public class StudentHandler {
	
	public static void addstudent() {
	
		ArrayList<Student>students=new ArrayList<>();	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("how many students do you want entry");
		int number=scan.nextInt();
		
		for(int i=0;i<number;i++) {
			System.out.println("enter student detail "+ (i+1));
			
			System.out.println("enter your id");
			int studentid=scan.nextInt();
			scan.nextLine();
			
			System.out.println("enter your name");
			String name=scan.nextLine();
			
			System.out.println("enter your age");
			int age=scan.nextInt();
			scan.nextLine();
			
			System.out.println("enter your dep");
			String dep=scan.nextLine();
			
			Student obj = new Student(studentid,name,age,dep);
			students.add(obj);
		}
		
		System.out.println("student details :");
		for(Student student :students) {
			System.out.println("student id "+ student.studentid +
							   ",name :" + student.name +
							   ",age :"+student.age +
							   ",dep :"+student.department);
			
		}
	}
	public static void editstudent() {
		
	}
	public static void deletestudent() {
		
	}
	
	public static void exitstudent() {
		
	}
}
	