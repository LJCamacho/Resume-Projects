package WarmUp;

import java.util.Scanner;
public class areaOfTrap {

	public static void main(String[] args) {
		Scanner anyVariable = new Scanner(System.in);
		double height;
		double base1, base2;
		
		System.out.println("Enter height:  ");
		height = anyVariable.nextDouble();
		
		System.out.println ("Enter base 1:  ");
		base1 = anyVariable.nextDouble();
		
		System.out.println ("Enter base 2:  ");
		base2 = anyVariable.nextDouble();
		
		
		double area = 0.5*height*(base1+base2);
		
		System.out.println();
		System.out.println ("*------------------------*");
		System.out.println("area = " + area);
		
	}//end main
}//end class
