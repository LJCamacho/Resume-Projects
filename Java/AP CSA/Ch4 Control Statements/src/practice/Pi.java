package practice;

import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {

		Scanner h = new Scanner(System.in);
		double in = 1;
		double out = 1.0;
		
		System.out.print("Enter the number of iterations:");
		in = h.nextInt();
		
		for(int x=1; x< in; in++) {
			out += Math.pow(-1, in)*1.0/(2.0*((double)in)+1.0);
		}
		
		System.out.println("The resulting value is:" + out);
		
	}
}
