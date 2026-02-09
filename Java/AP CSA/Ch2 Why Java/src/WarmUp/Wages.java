package WarmUp;

import java.util.Scanner;

public class Wages {

	public static void main(String[] args)  {
	Scanner reader = new Scanner (System.in);
		double wages;
	double hours;
	
	System.out.print ("Enter the hours worked:");
	hours = reader.nextDouble ();
	wages = hours * 11.75;
	System.out.print("Your wages are:");
	System.out.println(wages);
	
	}
	

}
