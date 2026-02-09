package practice;

import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
	
		
		Scanner reader = new Scanner (System.in);
		double a, q;
		
		System.out.println ("Enter the length:" );
		a=reader.nextDouble();
		
		q= 6*(a*a);
		
		System.out.println("surface area of cube is: "+ q);
	
	
	
	}
}
