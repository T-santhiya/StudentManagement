package application.view;

import java.util.Scanner;

import application.service.StudentHandler;

public class StudentView{
	public static void display() {
		System.out.println("Displaying student details");
		
		Scanner scan1=new Scanner(System.in);
		char detail;
		System.out.println("1 : Add " + "2: Edit "+ "3: Delete "+ "4: Exit");
		detail=scan1.next().charAt(0);
		
		switch(detail) {
		case'1':
			StudentHandler.addstudent();
			break;
		case'2':
			StudentHandler.editstudent();
			break;
		case'3':
			StudentHandler.deletestudent();
			break;
		case'4':
			StudentHandler.exitstudent();
			break;
		default:
			System.out.println("please enter the valid number");
		}
			
	}
}

