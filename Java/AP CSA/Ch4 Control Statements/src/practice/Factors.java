package practice;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Enter number: ");
		int n = reader.nextInt();
		
		int limit = n/2;
		int count = 0;
		
		for (int d = 2; d<= limit; d++) {
			if(n % d == 0) {
				System.out.print(d+ " ");
				count++;
			}
			
		}//end for loop
		
		if (count == 0) System.out.println("It prime");
		
		
	}//end main
}//end class
