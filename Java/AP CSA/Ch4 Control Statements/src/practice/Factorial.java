package practice;

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
	
		System.out.print("\nEnter the value: ");
		int h = n.nextInt();
		
		int fct = 1;
		while (h >= 1 ) {
			
			System.out.print(h + "* " );
			fct *= h;
			h--;
			
		}//end while
		
		System.out.println("\nFactorial = " +fct);
		
		
		
		
		
	}
}
