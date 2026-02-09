package practice;

import java.util.Scanner;

public class powerOfTwo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		int expo = 1;
		while (expo != -1) {
			System.out.println("Enter the exponent(-1 to halt): ");
			 expo = reader.nextInt();
			System.out.println(expo + " " + Math.pow(2,  expo));
			
		}
		
	}
}
