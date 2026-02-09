package practice;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		boolean prime = false;
		int min, max;
		
		
		
		while(true) {
		
			System.out.println("Enter the minimum: ");
			min = r.nextInt();
		
			while (true) {
				System.out.println("Enter the maximum: ");
				max = r.nextInt();
				if (max > min) break;
			
				System.out.println("Enter a bigger number than " + min);
			}//end second input
		
		
			while (min <= max) {
				int d = 2;
				while(d <= min/2) {
					if (min % d == 0) {
						prime = true; break; 
					}//end if
					d++;				
				}//end while
				
				if (!prime) System.out.print(min + " ");
				prime = false;
				min ++;
			}//end outside
			//consume
			r.nextLine();
			
			System.out.println("\nContinue? (y/n) ");
			//String str = r.nextLine();
			if (r.nextLine().equals("n"))break;
		}//end main while loop
	 
		
		
		
		
		
		
		
		
	}//end main

}//end class
