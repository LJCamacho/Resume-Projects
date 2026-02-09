package practice;

import java.util.Scanner;
public class myForLoopPractice {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int sum = 0; double count = 0;
		
		while(true) {
			System.out.println("Enter the initial");
			int a = reader.nextInt();
			System.out.println("Enter the terminal");
			int b = reader.nextInt();
		
		
		
			for (int j = Math.min(a, b); j <= Math.max(a, b); j++) {
			
				System.out.print(j+" ");
				sum+=j;	
				count++;
			
			}//end for loop
	
		
			System.out.println("\nAverage = " +(double) sum/count);
			System.out.print("-1 to quit: ");
			int q = reader.nextInt();
			if (q==-1)
				break;
		}//end while
		}}//end main and class
