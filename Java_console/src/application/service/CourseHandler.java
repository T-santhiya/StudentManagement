package application.service;

import java.util.ArrayList;
import java.util.Scanner;

import application.model.Course;

public class CourseHandler {
	
	public static void addcourse() {
		ArrayList<Course>courses=new ArrayList<>();
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("how many course for this student");
		int number=scan1.nextInt();
		
		for(int i=0;i<number;i++)
		{
			System.out.println("enter course details "+(i+1));
			
			System.out.println("enter your id");
			int id=scan1.nextInt();
			scan1.nextLine();
			
			System.out.println("enter your course name");
			String name=scan1.nextLine();
			
			System.out.println("enter your instructor");
			String instructor=scan1.nextLine();
			
			Course obj1 =new Course(id,name,instructor);
			courses.add(obj1);
		}
		
		System.out.println("course details :");
		for(Course a:courses ) {
			System.out.println("your id :"+a.courseid +
								",course name :"+a.name+
								",your instructor :"+a.instructor);
		}	
	}
	public static void editcourse() {
		
	}
	public static void deletecourse() {
		
	}
	public static void exitcourse() {
		
	}
}
	
		