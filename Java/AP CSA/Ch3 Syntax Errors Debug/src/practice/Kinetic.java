package practice;

import java.util.Scanner;

public class Kinetic {

	public static void main(String[] args) {
		Scanner nice = new Scanner (System.in);
		double mass;
		double velocity;
		
		System.out.println("Enter the mass of the object: ");
		mass = nice.nextDouble();
		System.out.println("Enter the velocity of the object: ");
		velocity = nice.nextDouble();
		
		double momentum = mass*velocity;
		double kinetic = (.5)*mass*(velocity*velocity);
				
		System.out.println();
		System.out.println ("*------------------------*");
		System.out.println("momentum = " + momentum);
		System.out.println("Kinetic energy ="+ kinetic);

		
		
		
		
		
		
		
	}//end main
}//end class