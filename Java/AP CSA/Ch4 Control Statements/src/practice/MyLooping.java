package practice;

import java.util.Scanner;

public class MyLooping {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter initial: ");
		int a = n.nextInt();
		
		System.out.println("Enter terminal: ");
		int b = n.nextInt();
		
		System.out.println("Enter increment: ");
		int c = n.nextInt();
		c = Math.abs(c);
		
		int sum = 0;
		
		if (a < b) {			
			
			while (a<= b) {
				System.out.print(a + " ");
				sum += a;
				a += c;
			}//end while
		}else if (a > b) {
			while (a>= b) {
				System.out.print(a + " ");
				sum += a;
				a -= c;
			}//end while
		}else
			System.out.println("Okay...?");
		
		
		System.out.println("\nSum = "+ sum);
		
		
		
		
		
		/*
		int n = 10;
		int sum= 0;
		while (n<=100) {
			System.out.print(n+ " ");
			sum = sum + n; //sum += n;
			n+=7; //n = n+7
		}//end while
		
		System.out.println ("\nSum = " + sum);
		
		int r = 25;
		
		while (r >= 10)  {
			
			System.out.println("SquareRoot of "+ r+ "="+ Math.sqrt(r));
			r -= 5;			
		}//end while
		*/
		
		
	}
}
