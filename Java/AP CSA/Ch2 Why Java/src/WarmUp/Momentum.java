package WarmUp;

import java.util.Scanner;

public class Momentum {

	public static void main(String[] args) {
		Scanner nice = new Scanner (System.in);
		double mass;
		double velocity;
		
		System.out.println("Enter the mass of the object: ");
		mass = nice.nextDouble();
		System.out.println("Enter the velocity of the object: ");
		velocity = nice.nextDouble();
		
		double momentum = mass*velocity;
				
		System.out.println();
		System.out.println ("*------------------------*");
		System.out.println("momentum = " + momentum);

		
		
		
		
		
		
		
	}//end main
}//end class
