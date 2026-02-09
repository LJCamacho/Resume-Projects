package practice;

import java.util.Scanner;
public class RightTriangle {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double h, i, j;
		System.out.print("\nEnter the value (a): ");
		double a = reader.nextInt();
		a = Math.pow(a, 2);
		System.out.print("\nEnter the value (b): ");
		double b = reader.nextInt();
		b = Math.pow(b, 2);
		System.out.print("\nEnter the value (c): ");
		double c = reader.nextInt();
		c = Math.pow(c, 2);
		
		if (a > b)
			if (a>b) {
				j = a;h = b; i = c;
			}
			else {
				j = c; h = a; i = b;
			}
		else {
			
		}
	}
}
