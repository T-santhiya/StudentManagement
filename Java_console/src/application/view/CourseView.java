package application.view;
import java.util.*;
import application.service.CourseHandler;

public class CourseView {
	public static void display() {
				System.out.println("Displaying student details");
				
				Scanner scan1=new Scanner(System.in);
				char detail;
				System.out.println("1 : Add " + "2: Edit "+ "3: Delete "+ "4: Exit");
				detail=scan1.next().charAt(0);
				
				switch(detail) {
				case'1':
					CourseHandler.addcourse();
					break;
				case'2':
					CourseHandler.editcourse();
					break;
				case'3':
					CourseHandler.deletecourse();
					break;
				case'4':
					CourseHandler.exitcourse();
					break;
				default:
					System.out.println("please enter the valid number");
				}
					
			}
	}

