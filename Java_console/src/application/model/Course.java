package application.model;

import java.util.ArrayList;
import java.util.List;

public class Course {
	public int courseid;
	public String name;
	public String instructor;
	public List<Student>students;
	
	
	public Course(int courseid,String name,String instructor){
		
		this.courseid=courseid;
		this.name=name;
		this.instructor=instructor;
		this.students=new ArrayList<>();
		
		System.out.println(name);
	}
}
