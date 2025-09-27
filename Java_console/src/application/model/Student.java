package application.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public int studentid;
    public String name;
    public int age;
    public String department;
    public List<Course>courses;
    
  public  Student(int studentid,String name,int age,String department){
  	  this.studentid=studentid;
  	  this.name=name;
  	  this.age=age;
  	  this.department=department;
  	  this.courses=new ArrayList<>();
  	   	   
    }
}
