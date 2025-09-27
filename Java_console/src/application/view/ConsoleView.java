package application.view;
import java.util.Scanner;

public class ConsoleView {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
	
	
		System.out.println(" 1 :Students details "
						+" 2 : Course details "
						+" 3 : Exit");
	
	
		char enter;
		System.out.println("enter the number : 1 (or) 2 (or) 3");
		enter = scan.next().charAt(0);
		
		switch(enter) {
		case'1':
			StudentView.display();
			break;
		case'2':
			CourseView.display();
			break;
		case'3':
			System.out.println("exit");
			return;
		default:
			System.out.println("invaild your number pls reenter your number");
			
		}
	}
}
