package practice;

import java.util.Scanner;
//Mr temple went oveer this in class as practice 
public class Project45EstimatingPi {

	public static void main(String[] args) {

		Scanner n = new Scanner(System.in);
		
		//Pi/4 = 1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11...
		
		//Pi = 4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11...)
		
		System.out.println("Enter number of iterations");
		int i = n.nextInt();
		
		double sum = 0;
		int d = 1, sign = 1;
		/*
		for (int j = 1;j<=i; j++) {
			
			sum += sign * 1.0/d;
			d += 2; sign *= -1;
			
		}//end for
		System.out.println("Pi = "+ (4*sum));
		*/
		int j = 1;
		while (j <= i) {
			
			sum += sign * 1.0/d;
			d += 2; sign *= -1;
			j++;
		}
		System.out.println("Pi = "+ (4*sum));
		
	}//end main
}//end class
