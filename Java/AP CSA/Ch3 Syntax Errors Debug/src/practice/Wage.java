package practice;

import java.util.Scanner;
public class Wage {

	public static void main(String[] args) {


			//variables
		Scanner reader = new Scanner(System.in);
		double w, h, s;
		
		System.out.println ("Wage: ");
		w = reader.nextDouble();
		
		System.out.println ("Hours: ");
		h = reader.nextDouble();
		
		s = w*(40) + 1.5*w*(h-40);
		
		System.out.println ("Weekly salary: $ " +s);	
		
		reader.close();
		
		
		
	
	}//end main
}//end class
