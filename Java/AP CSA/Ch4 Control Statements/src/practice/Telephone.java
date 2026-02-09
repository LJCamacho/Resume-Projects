package practice;

import java.util.Scanner;

public class Telephone {

	public static void main(String[] args) {
		Scanner h = new Scanner(System.in);
		
		
		double cost;
	
		System.out.println("Enter the amount of minutes");
		int minutes = h.nextInt();
		
		if (minutes <= 2) {
			 cost = 1.15;
		}
		else {
		 cost = 1.15 + 0.5*(minutes-2);
		}
		System.out.println("The cost of the call is: $"+ cost);
		
		
	}
}
