package handleInputExceptions;

import java.util.Scanner;

public class MismatchExample {
	public static void main(String[] args) {
	Scanner reader = new Scanner(System.in);
	int n = 0;
	
	while(true) {
		try {
			System.out.println("Enter number: ");
			n = reader.nextInt();
			break;
		}catch(Exception e) {
	
				System.out.println("Invalid Data");
				System.out.println(e);
				reader.nextLine();
				
		}//end catch
	}//end while
	
	System.out.println("number = " + n);	
		
		
	
	}//end main
}//end class
