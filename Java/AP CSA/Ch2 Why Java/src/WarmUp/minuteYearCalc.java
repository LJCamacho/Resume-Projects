package WarmUp;

import java.util.Scanner;

public class minuteYearCalc {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		double years;
		
		System.out.println("Enter the number of years: ");
		years = reader.nextDouble();
		
		double minutes = 525600*years;
		
		System.out.println();
		System.out.println ("*------------------------*");
		System.out.println("minutes = " + minutes);
		
	}//end main
}//end class
