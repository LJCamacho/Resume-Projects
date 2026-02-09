package practice;

import java.util.Scanner;
public class Quotient {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int d, r;
		System.out.print("\nEnter value a: ");
		int a= read.nextInt();
		
		System.out.print("\nEnter value b: ");
		int b = read.nextInt();
		
		
		if (a > b) {
			d = a / b;
			r = a % b;
		}
		else {
			d = b / a;
			r = b % a;
		}
		
	
	
		System.out.println(d+"r"+r);
		
		

	}
}
